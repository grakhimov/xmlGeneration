package com.company;

import com.company.Utils.PriceNode;
import com.company.Utils.PricesFieldsGenerators.*;
import com.company.Utils.ProductFieldsGenerators.*;
import com.company.Utils.ProductNode;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductCodeGenerator productCodeGenerator = new ProductCodeGenerator();
        //CountryGenerator countryGenerator = new CountryGenerator();
        //CurrencyGenerator currencyGenerator = new CurrencyGenerator();
        PriceGenerator priceGenerator = new PriceGenerator();
        ValidFromGenerator validFromGenerator = new ValidFromGenerator();

        AvailableGenerator availableGenerator = new AvailableGenerator();
        BusinessAreaGenerator businessAreaGenerator = new BusinessAreaGenerator();
        BuyableGenerator buyableGenerator = new BuyableGenerator();
        ProductCenterGenerator productCenterGenerator = new ProductCenterGenerator();
        ProductGroupGenerator productGroupGenerator = new ProductGroupGenerator();
        ProductTypeGenerator productTypeGenerator = new ProductTypeGenerator();
        StatusGenerator statusGenerator = new StatusGenerator();

        int numberOfNodes = 20000;

        ArrayList<Integer> productCodes = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            int productCode = productCodeGenerator.productCodeGenerator();
            productCodes.add(productCode);
        }

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("\\GEUK\\products.xml"), "utf-8"))) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<hybris:lsproducts\n" +
                    "xmlns:hybris=\"http://www.HybrisRest.org/RestAPIsend/xsd/HybrisInput\">\n");
            for (int i = 0; i < numberOfNodes; i++) {
                int productCode = productCodes.get(i);
                String buyable = buyableGenerator.buyableGenerator();
                String available = availableGenerator.availableGenerator();
                String status = statusGenerator.statusGenerator();
                String businessArea = businessAreaGenerator.businessAreaGenerator();
                String businessAreaId = businessAreaGenerator.getBusinessAreaId();
                String productCenter = productCenterGenerator.productCenterGenerator();
                String productCenterId = productCenterGenerator.getProductCenterId();
                String productGroup = productGroupGenerator.productGroupGenerator();
                String productGroupId = productGroupGenerator.getProductGroupId();
                String productType = productTypeGenerator.productTypeGenerator();

                ProductNode productNode = new ProductNode();
                productNode.setProductNode(productCode, buyable, available, status, businessAreaId, businessArea, productCenterId, productCenter, productGroupId, productGroup, productType);

                writer.write(productNode.getProductNode());
            }
            writer.write("</hybris:lsproducts>");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> activeCountries = new ArrayList<>(Arrays.asList("AR", "AT", "AU", "BE", "BR", "CA", "CH", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "IE", "IT", "LT", "LV", "MX", "NL",
                "NO", "NZ", "PT", "SE", "US"));
        List<String> currencyIsoCodes = new ArrayList<>(Arrays.asList("USD", "EUR", "AUD", "EUR", "BRL", "CAD", "CHF", "EUR", "DKK", "EUR", "EUR", "EUR", "EUR", "GBR", "EUR", "EUR", "EUR",
                "EUR", "USD", "EUR", "NOK", "NZD", "EUR", "SEK", "USD"));

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("\\GEUK\\prices.xml"), "utf-8"))) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<hyb:lsProductPrices xmlns:hyb=\"http://www.HybrisRest.org/RestAPIsend/xsd/HybrisPriceInput\">\n");
            for (int i = 0; i < numberOfNodes; i++) {
                int productCode = productCodes.get(i);
                for (int j = 0; j < activeCountries.size(); j++) {
                    String country = activeCountries.get(j);
                    String currency = currencyIsoCodes.get(j);
                    String price = priceGenerator.priceGenerator();
                    String validFrom = validFromGenerator.validFromGenerator();

                    PriceNode priceNode = new PriceNode();
                    //priceNode.setPriceNodeWithCurrencyPriceId(productCode, country, currency, price, validFrom, currencyPriceId);
                    priceNode.setPriceNode(productCode, country, currency, price, validFrom);
                    writer.write(priceNode.getPriceNode());
                }

            }
            writer.write("</hyb:lsProductPrices>");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

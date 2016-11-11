package com.company;

import com.company.Utils.*;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        ProductCodeGenerator productCodeGenerator = new ProductCodeGenerator();
        CountryGenerator countryGenerator = new CountryGenerator();
        CurrencyGenerator currencyGenerator = new CurrencyGenerator();
        PriceGenerator priceGenerator = new PriceGenerator();
        ValidFromGenerator validFromGenerator = new ValidFromGenerator();

        int numberOfNodes = 100000;
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("\\GEUK\\prices.xml"), "utf-8"))) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<lsProductPrices>\n");
            for (int i = 0; i < numberOfNodes; i++) {
                int productCode = productCodeGenerator.productCodeGenerator();
                String country = countryGenerator.countryGenerator();
                String currency = currencyGenerator.currencyGenerator();
                String price = priceGenerator.priceGenerator();
                String validFrom = validFromGenerator.validFrom();
                Node node = new Node();
                node.setNode(productCode, country, currency, price, validFrom);
                writer.write(node.getNode());
            }
            writer.write("</lsProductPrices>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

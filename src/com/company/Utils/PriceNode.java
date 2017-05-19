package com.company.Utils;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class PriceNode {
    private int productCode;
    private String country;
    private String currency;
    private String price;
    private String validFrom;
    private int currencyPriceId;

    public void setPriceNode(int productCode, String country, String currency, String price, String validFrom){
        this.productCode = productCode;
        this.country = country;
        this.currency = currency;
        this.price = price;
        this.validFrom = validFrom;
    }

    public String getPriceNode(){
        String node = " <hyb:lsProductPrice productCode=\"" + productCode + "\">\n" +
                "       <hyb:countryPrice country=\"" + country + "\">\n" +
                "           <hyb:currencyPrice currency=\"" + currency + "\" listFlag=\"Y\">\n" +
                "               <hyb:price>" + price + "</hyb:price>\n" +
                "               <hyb:validFrom>" + validFrom + "</hyb:validFrom>\n" +
                "               <hyb:validTo>2020-12-31</hyb:validTo>\n" +
                "               <hyb:priceUpdateDate>2016-01-01T07:00:00.000Z</hyb:priceUpdateDate>\n" +
                "           </hyb:currencyPrice>\n" +
                "       </hyb:countryPrice>\n" +
                "   </hyb:lsProductPrice>\n";
        return node;
    }
    public void setPriceNodeWithCurrencyPriceId(int productCode, String country, String currency, String price, String validFrom, int currencyPriceId){
        this.productCode = productCode;
        this.country = country;
        this.currency = currency;
        this.price = price;
        this.validFrom = validFrom;
        this.currencyPriceId = currencyPriceId;
    }

    public String getPriceNodeWithCurrencyPriceId(){
        String node = " <lsProductPrice productCode=\"" + productCode + "\">\n" +
                "    <countryPrice country=\"" + country + "\">\n" +
                "      <currencyPrice id=\"" + currencyPriceId + "\" currency=\"" + currency + "\" listFlag=\"N\">\n" +
                "            <price>" + price + "</price>\n" +
                "            <validFrom>" + validFrom + "</validFrom>\n" +
                "            <validTo>2016-12-31</validTo>\n" +
                "      </currencyPrice>\n" +
                "    </countryPrice>\n" +
                "   </lsProductPrice>";
        return node;
    }
}

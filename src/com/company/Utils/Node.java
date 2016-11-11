package com.company.Utils;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class Node {
    private int productCode;
    private String country;
    private String currency;
    private String price;
    private String validFrom;

    public void setNode(int productCode, String country, String currency, String price, String validFrom){
        this.productCode = productCode;
        this.country = country;
        this.currency = currency;
        this.price = price;
        this.validFrom = validFrom;
    }

    public String getNode(){
        String node = " <lsProductPrice productCode=“" + productCode + "”>\n" +
                "       <countryPrice country=\"" + country + "\">\n" +
                "           <currencyPrice currency=\"" + currency + "\" listFlag=\"N\">" + price + "</currencyPrice>\n" +
                "           <validFrom>" + validFrom + "</validFrom>\n" +
                "       </countryPrice>\n" +
                "   </lsProductPrice>\n";
        return node;
    }
}

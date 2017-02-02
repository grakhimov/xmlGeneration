package com.company.Utils.PricesFieldsGenerators;

import java.text.DecimalFormat;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class PriceGenerator {
    public String priceGenerator(){
        double price = (Math.random()*1000 + 1);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(price);
    }
}

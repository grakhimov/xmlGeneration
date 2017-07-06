package com.company.Utils.ProductFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/14/2016.
 */
public class BuyableGenerator {
    public String buyableGenerator() {
        String buyable = null;
        double randomValue = Math.random();
        if (randomValue < 0.5) {
            buyable = "true";
        }
        if (randomValue >= 0.5 & randomValue < 1) {
            buyable = "false";
        }
        return buyable;
    }
}

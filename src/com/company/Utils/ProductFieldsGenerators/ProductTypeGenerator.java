package com.company.Utils.ProductFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/14/2016.
 */
public class ProductTypeGenerator {
    public String productTypeGenerator(){
        double randomValue = Math.random();
        String productType = null;
        if (randomValue < 0.25) {
            productType = "ACCESSORIES";
        }
        if (randomValue >= 0.25 & randomValue < 0.5) {
            productType = "CONSUMABLES";
        }
        if (randomValue >= 0.5 & randomValue < 0.75) {
            productType = "INSTRUMENTS_EQUIPMENTS";
        }
        if (randomValue >= 0.75 & randomValue < 1) {
            productType = "SPARE_PARTS";
        }
        return productType;
    }
}

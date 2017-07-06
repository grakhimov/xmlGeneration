package com.company.Utils.PricesFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class ProductCodeGenerator {
    public int productCodeGenerator() {
        int productCode = (int) (Math.random() * 100000000);
        return productCode;
    }
}

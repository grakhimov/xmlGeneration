package com.company.Utils.ProductFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/14/2016.
 */
public class ProductCenterGenerator {
    String productCenter = null;
    public String productCenterGenerator(){
        double randomValue = Math.random();
        if (randomValue < 0.25) {
            productCenter = "PURIFICATION_MEDIA";
        }
        if (randomValue >= 0.25 & randomValue < 0.5) {
            productCenter = "PROTEIN_SAMPLE_PREP";
        }
        if (randomValue >= 0.5 & randomValue < 0.75) {
            productCenter = "PURIFICATION_SYSTEMS";
        }
        if (randomValue >= 0.75 & randomValue < 1) {
            productCenter = "NUCLEIC_ACID_PURIFICATION";
        }
        return productCenter;
    }
    public String getProductCenterId(){
        String productCenterID = null;
        if (productCenter == "PURIFICATION_MEDIA") {
            productCenterID = "42";
        }
        if (productCenter == "PROTEIN_SAMPLE_PREP"){
            productCenterID = "92";
        }
        if (productCenter == "PURIFICATION_SYSTEMS") {
            productCenterID = "46";
        }
        if (productCenter == "NUCLEIC_ACID_PURIFICATION"){
            productCenterID = null;}
        return productCenterID;
    }
}

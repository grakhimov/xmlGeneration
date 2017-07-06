package com.company.Utils.ProductFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/14/2016.
 */
public class BusinessAreaGenerator {
    String businessArea = null;

    public String businessAreaGenerator() {
        double randomValue = Math.random();
        if (randomValue < 0.5) {
            businessArea = "RESEARCH_MARKET";
        }
        if (randomValue >= 0.5 & randomValue < 1) {
            businessArea = "BIOPROCESS";
        }
        return businessArea;
    }

    public String getBusinessAreaId() {
        String businessAreaId = null;
        if (businessArea == "BIOPROCESS") {
            businessAreaId = "021";
        }
        if (businessArea == "RESEARCH_MARKET") {
            businessAreaId = "025";
        }
        return businessAreaId;
    }
}

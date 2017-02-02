package com.company.Utils.ProductFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/14/2016.
 */
public class StatusGenerator {
    public String statusGenerator() {
        double randomValue = Math.random();
        String status = null;
        if (randomValue < 0.143) {
            status = "DEVELOPMENT";
        }
        if (randomValue >= 0.143 & randomValue < 0.286) {
            status = "PRE_ACTIVE";
        }
        if (randomValue >= 0.286 & randomValue < 0.429) {
            status = "ACTIVE";
        }
        if (randomValue >= 0.429 & randomValue < 0.572) {
            status = "PHASE_OUT";
        }
        if (randomValue >= 0.572 & randomValue < 0.715) {
            status = "SALES_STOP";
        }
        if (randomValue >= 0.715 & randomValue < 0.858) {
            status = "OBSOLETE";
        }
        if (randomValue >= 0.858 & randomValue < 1) {
            status = "OBSOLETE_WITH_SERVICE";
        }
        return status;
    }
}

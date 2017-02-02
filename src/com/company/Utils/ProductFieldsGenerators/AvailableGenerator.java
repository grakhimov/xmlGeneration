package com.company.Utils.ProductFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/14/2016.
 */
public class AvailableGenerator {
    public String availableGenerator(){
        String available = null;
        double randomValue = Math.random();
        if (randomValue < 0.5){
            available = "true";
        }
        if (randomValue >= 0.5 & randomValue < 1){
            available = "false";
        }
        return available;
    }
}



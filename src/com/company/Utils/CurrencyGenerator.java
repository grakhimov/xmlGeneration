package com.company.Utils;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class CurrencyGenerator {
    public String currencyGenerator(){
        String currency = null;
        double randomValue = Math.random();
        if (randomValue < 0.2){
            currency = "USD";
        }
        if (randomValue >= 0.2 & randomValue < 0.4){
            currency = "EUR";
        }
        if (randomValue >= 0.4 & randomValue < 0.6){
            currency = "JPY";
        }
        if (randomValue >= 0.6 & randomValue < 0.8){
            currency = "RUB";
        }
        if (randomValue >= 0.8 & randomValue < 1){
            currency = "UAH";
        }
        return currency;
    }

}

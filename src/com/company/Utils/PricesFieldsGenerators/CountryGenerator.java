package com.company.Utils.PricesFieldsGenerators;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class CountryGenerator {
    @SuppressWarnings("ConstantConditions")
    public String countryGenerator() {
        double randomValue = Math.random();
        String country = null;
        if (randomValue < 0.025) {
            country = "AU";
        }
        if (randomValue >= 0.025 & randomValue < 0.05) {
            country = "CN";
        }
        if (randomValue >= 0.05 & randomValue < 0.075) {
            country = "HK";
        }
        if (randomValue >= 0.075 & randomValue < 0.1) {
            country = "IN";
        }
        if (randomValue >= 0.1 & randomValue < 0.125) {
            country = "JP";
        }
        if (randomValue >= 0.125 & randomValue < 0.15) {
            country = "KR";
        }
        if (randomValue >= 0.15 & randomValue < 0.175) {
            country = "NZ";
        }
        if (randomValue >= 0.175 & randomValue < 0.2) {
            country = "SG";
        }
        if (randomValue >= 0.2 & randomValue < 0.225) {
            country = "TW";
        }
        if (randomValue >= 0.225 & randomValue < 0.25) {
            country = "TH";
        }
        if (randomValue >= 0.25 & randomValue < 0.275) {
            country = "AT";
        }
        if (randomValue >= 0.275 & randomValue < 0.3) {
            country = "BE";
        }
        if (randomValue >= 0.3 & randomValue < 0.325) {
            country = "BG";
        }
        if (randomValue >= 0.325 & randomValue < 0.35) {
            country = "CZ";
        }
        if (randomValue >= 0.35 & randomValue < 0.375) {
            country = "DK";
        }
        if (randomValue >= 0.375 & randomValue < 0.4) {
            country = "EE";
        }
        if (randomValue >= 0.4 & randomValue < 0.425) {
            country = "FI";
        }
        if (randomValue >= 0.425 & randomValue < 0.45) {
            country = "FR";
        }
        if (randomValue >= 0.45 & randomValue < 0.475) {
            country = "DE";
        }
        if (randomValue >= 0.475 & randomValue < 0.5) {
            country = "IE";
        }
        if (randomValue >= 0.5 & randomValue < 0.525) {
            country = "IE";
        }
        if (randomValue >= 0.525 & randomValue < 0.55) {
            country = "IT";
        }
        if (randomValue >= 0.55 & randomValue < 0.575) {
            country = "LV";
        }
        if (randomValue >= 0.575 & randomValue < 0.6) {
            country = "LT";
        }
        if (randomValue >= 0.6 & randomValue < 0.625) {
            country = "NL";
        }
        if (randomValue >= 0.625 & randomValue < 0.65) {
            country = "NO";
        }
        if (randomValue >= 0.65 & randomValue < 0.675) {
            country = "PL";
        }
        if (randomValue >= 0.675 & randomValue < 0.7) {
            country = "PT";
        }
        if (randomValue >= 0.7 & randomValue < 0.725) {
            country = "RO";
        }
        if (randomValue >= 0.725 & randomValue < 0.75) {
            country = "SK";
        }
        if (randomValue >= 0.75 & randomValue < 0.775) {
            country = "SI";
        }
        if (randomValue >= 0.775 & randomValue < 0.8) {
            country = "ES";
        }
        if (randomValue >= 0.8 & randomValue < 0.825) {
            country = "SE";
        }
        if (randomValue >= 0.825 & randomValue < 0.85) {
            country = "CH";
        }
        if (randomValue >= 0.85 & randomValue < 0.875) {
            country = "GB";
        }
        if (randomValue >= 0.875 & randomValue < 0.9) {
            country = "AR";
        }
        if (randomValue >= 0.9 & randomValue < 0.925) {
            country = "BR";
        }
        if (randomValue >= 0.925 & randomValue < 0.95) {
            country = "CA";
        }
        if (randomValue >= 0.95 & randomValue < 0.975) {
            country = "MX";
        }
        if (randomValue >= 0.975 & randomValue < 1) {
            country = "US";
        }
        return country;
    }
}

package com.company.Utils.PricesFieldsGenerators;

import java.time.LocalDate;
import java.util.Random;

/**
 * Created by George_Rakhimov on 11/9/2016.
 */
public class ValidFromGenerator {
    public String validFromGenerator() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(2016, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2016, 12, 31).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        String validFrom = randomDate.toString();
        return validFrom;
    }
}

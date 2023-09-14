package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

public class Solution {
    public static void printBonusDatesBetween(int fromYear, int toYear) {
        LocalDate currentDateToCheck = LocalDate.of(fromYear, 1 , 1);
        do {
            String dateString = currentDateToCheck.format(DateTimeFormatter.BASIC_ISO_DATE);
            String reversedDateString = new StringBuilder(dateString).reverse().toString();

            if (Objects.equals(dateString, reversedDateString))
                System.out.println(currentDateToCheck);

            currentDateToCheck = currentDateToCheck.plusDays(1);
        } while (currentDateToCheck.getYear() < toYear);
    }
}

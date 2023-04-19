package edu.sda.java.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.plusDays(2).getDayOfWeek());
        System.out.println(localDate.plusDays(-2).getDayOfWeek());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.atZone(ZoneId.of("America/Chicago")));

        LocalDateTime newDateTime = LocalDateTime.of(2013, 7, 13, 2, 24);
        System.out.println(newDateTime);
    }

    /**
     * Add a LocalDate "date of production" to engine and another one to car
     * print them with other car data, but narrow engine to year and car to month and year of production
     */

}

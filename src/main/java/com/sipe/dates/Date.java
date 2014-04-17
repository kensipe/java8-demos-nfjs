package com.sipe.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.next;

/**
 * @author kensipe
 */
public class Date {

    public static void main(String[] args) {

        LocalDate current = LocalDate.now();
        System.out.println(current);

        LocalDate bday = LocalDate.of(2013, Month.OCTOBER, 25);
        System.out.println(bday);

        bday.plusYears(1);
        System.out.println(bday);

        LocalDate newbDay = bday.plusYears(1);
        System.out.println(newbDay);


        System.out.println(bday.plusMonths(3).minusDays(5));

        LocalDate lastDay = current.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate nextTuesday = current.with(next(DayOfWeek.TUESDAY));

        System.out.println("next tues: " + nextTuesday);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy");
        System.out.println(nextTuesday.format(format));
    }
}

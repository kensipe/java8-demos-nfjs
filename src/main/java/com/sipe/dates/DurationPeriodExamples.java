package com.sipe.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author kensipe
 */
public class DurationPeriodExamples {

    public static void main(String[] args) throws InterruptedException {

        chronoExample();
        durationExample();
        periodExample();

    }

    private static void periodExample() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1969, Month.OCTOBER, 25);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() +
                " days old. (" + p2 + " days total)");
    }

    private static void durationExample() throws InterruptedException {
        Instant t1 = Instant.now();
        Thread.sleep(1001);
        Instant t2 = Instant.now();

        long ns = Duration.between(t1, t2).toNanos();

        System.out.println("ns = " + ns);

        Instant start = Instant.now();
        Duration gap = Duration.ofSeconds(10);
        Instant later = start.plus(gap);

        System.out.println("start = " + start);
        System.out.println("later = " + later);
    }


    private static void chronoExample() throws InterruptedException {
        Instant previous, current;
        long gap = 0L;

        previous = Instant.now();

        Thread.sleep(1001);

        current = Instant.now();
        if (previous != null) {
            gap = ChronoUnit.MILLIS.between(previous, current);
        }

        System.out.println("gap " + gap);
    }
}

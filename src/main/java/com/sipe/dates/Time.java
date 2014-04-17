package com.sipe.dates;

import java.time.LocalTime;

/**
 * @author kensipe
 */
public class Time {

    public static void main(String[] args) {

        LocalTime current = LocalTime.now();
        LocalTime time = LocalTime.of(13, 30);

        System.out.println(current);
        System.out.println(time);
    }

}

package com.sipe.lambda;

/**
 * @author kensipe
 */

@FunctionalInterface
public interface AgeCalculator {

    int yearsUntil(Person person);
}

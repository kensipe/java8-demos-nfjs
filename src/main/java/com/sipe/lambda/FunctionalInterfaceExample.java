package com.sipe.lambda;

/**
 * @author kensipe
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        FunctionalInterfaceExample example = new FunctionalInterfaceExample();

        example.printYearsUtil((p) -> 18 - p.getAge(), new Person(14, "Jon", "Sipe"));
    }

    public void printYearsUtil(AgeCalculator ageCalculator, Person person) {
        System.out.print("years until 18" + ageCalculator.yearsUntil(person));
    }
}

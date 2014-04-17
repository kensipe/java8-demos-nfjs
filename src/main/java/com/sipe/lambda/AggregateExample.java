package com.sipe.lambda;

import java.util.Collection;
import java.util.List;
import java.util.OptionalInt;

/**
 * @author kensipe
 */
public class AggregateExample {

    public static void main(String[] args) {


        List<Person> people = PersonHelper.getPeople();

        oldSchool(people);

        java8(people);
    }

    private static void java8(List<Person> people) {

        // OptionalInt
        int oldestSipe = people.stream().filter(p -> p.getLastName().contains("Sipe")).mapToInt(p -> p.getAge()).max().getAsInt();

//        int oldestSipe = people.stream().filter(p -> p.getLastName().contains("Sipe")).mapToInt(p -> p.getAge()).max().orElse(0);

        System.out.println("oldest sipe is: " + oldestSipe);

    }

    private static void oldSchool(List<Person> people) {
        int oldestSipe = 0;

        for (Person person : people) {
            if (person.getLastName().equals("Sipe")) {
                int age = person.getAge();
                oldestSipe = Math.max(age, oldestSipe);
            }
        }

        System.out.println("oldest sipe is: " + oldestSipe);
    }

}

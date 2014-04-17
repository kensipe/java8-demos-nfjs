package com.sipe.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kensipe
 */
public class PersonHelper {

    public static List<Person> getPeople() {
        List<Person> people =
                Arrays.asList(
                        new Person(23, "Amanda", "Flint"),
                        new Person(14, "Jon", "Sipe"),
                        new Person(16, "Kenny", "Sipe"));

        List peopleList = new ArrayList<>(people.size());
        peopleList.addAll(people);
        return peopleList;
    }

    public static void printPeople(List<Person> people) {

        for (Person person : people) {
            System.out.println(person);
        }
    }

}

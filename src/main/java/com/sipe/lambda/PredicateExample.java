package com.sipe.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author kensipe
 */
public class PredicateExample {

    public static void main(String[] args) {

        List<Person> people = PersonHelper.getPeople();

        oldSchool(people);

        java8Way(people);
    }

    private static void java8Way(List<Person> people) {
        Comparator<Person> ageComparator =
                (o1, o2) -> ((Integer) o1.getAge()).compareTo(o2.getAge());

        List<Person> peop = new ArrayList<>();

        System.out.println("** pre sort **");
        PersonHelper.printPeople(people);

        Collections.sort(people,
                (o1, o2) -> ((Integer) o1.getAge()).compareTo(o2.getAge()));

        //or
//        Collections.sort(people, (Person o1, Person o2) -> ((Integer) o1.getAge()).compareTo(o2.getAge()));

        System.out.println("** post sort **");
        PersonHelper.printPeople(people);

    }

    private static void oldSchool(List<Person> people) {
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return ((Integer) o1.getAge()).compareTo(o2.getAge());
            }
        };

        System.out.println("** pre sort **");
        PersonHelper.printPeople(people);

        Collections.sort(people, ageComparator);

        System.out.println("** post sort **");
        PersonHelper.printPeople(people);
    }


}

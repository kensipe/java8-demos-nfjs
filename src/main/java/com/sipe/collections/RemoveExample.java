package com.sipe.collections;

import com.sipe.lambda.Person;
import com.sipe.lambda.PersonHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author kensipe
 */
public class RemoveExample {

    public static void main(String[] args) {
        oldSchool();
    }

    public static void oldOldSchool() {
        List<Person> people = PersonHelper.getPeople();

        for (Iterator<Person> it = people.iterator(); it.hasNext(); ) {
            Person p = it.next();
            if (p.getAge() > 18) {
                it.remove();
            }
        }
    }

    public static void oldSchool() {
        List<Person> people = PersonHelper.getPeople();

        PersonHelper.printPeople(people);

        // older api
        //        Collections.removeAll(people,
        //                  new Predicate<Person>() {
        //                    @Override
        //                    public boolean test(Person person) {
        //                        return person.getAge() > 18;
        //                    }
        //                });


        people.removeIf(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 18;
            }
        });

        System.out.println("removing adults");
        PersonHelper.printPeople(people);

    }

    public static void java8() {
        List<Person> people = new ArrayList<>();
        people.addAll(PersonHelper.getPeople());

        PersonHelper.printPeople(people);


//        people.removeIf((Person person) -> {
//            return person.getAge() > 18;
//        });

        people.removeIf(person -> person.getAge() > 18);


        System.out.println("removing adults");
        PersonHelper.printPeople(people);

    }
}

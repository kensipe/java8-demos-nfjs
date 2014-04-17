package com.sipe.collections;

import com.sipe.lambda.Person;
import com.sipe.lambda.PersonHelper;

import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

/**
 * @author kensipe
 */
public class Comparing {

    public static void main(String[] args) {

        List<Person> people = PersonHelper.getPeople();

        Comparator<Person> c = (p, o) ->
                p.getLastName().compareTo(o.getLastName());

        c = c.thenComparing((p, o) ->
                p.getFirstName().compareTo(o.getFirstName()));

        people.sort(c);

        people.forEach(out::println);

    }
}

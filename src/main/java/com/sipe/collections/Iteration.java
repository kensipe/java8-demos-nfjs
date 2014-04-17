package com.sipe.collections;

import java.util.Arrays;
import java.util.List;

/**
 * inspired by Venkat Subramaniam book and code examples
 * http://pragprog.com/book/vsjava8/functional-programming-in-java
 *
 * @author kensipe
 */
public class Iteration {

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        friends.forEach((final String name) -> System.out.println(name));
    }
}

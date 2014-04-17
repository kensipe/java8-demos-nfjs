package com.sipe.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

import static java.lang.System.out;
import static java.util.stream.Collectors.*;

/**
 * may check in a file to provide all the words
 *
 * @author kensipe
 */
public class WordCount {

    public static void main(String[] args) {

        fun10();
    }

    private static void fun1() {
        long count = words().stream()
                .filter(w -> w.length() > 4)
                .count();

        System.out.println("count " + count);
    }

    private static void fun2() {
        long count = words().stream()
                .filter(w -> w.length() > 4)
                .mapToLong(e -> 1L)
                .sum();

        System.out.println("count " + count);
    }

    private static void fun3() {
        long count = words().stream()
                .filter(w -> w.length() > 4)
                .mapToLong(e -> 1L)
                .reduce(0, Long::sum);

        System.out.println("count " + count);
    }

    private static void fun4() {
        long count = words().stream()
                .filter(w -> w.length() > 4)
                .mapToLong(e -> 1L)
                .reduce(0, (a, b) -> a + b);

        System.out.println("count " + count);
    }

    private static void fun5() {
        String comb = words().stream()
                .filter(w -> w.length() > 4)
                .reduce("", (a, b) -> a + ", " + b);

        System.out.println("count " + comb);
    }

    private static void fun6() {
        Optional<String> comb = words().stream()
                .filter(w -> w.length() > 4)
                .reduce((a, b) -> a + ", " + b);

        System.out.println("count " + comb.orElse(""));
    }

    private static void fun7() {
        String comb = words().stream()
                .filter(w -> w.length() > 4)
                .collect(joining(", "));

        System.out.println("count " + comb);
    }

    private static void fun8() {
        Map<String, Long> freqMap = words().stream()
                .collect(groupingBy(w -> w, counting()));

        System.out.println("map " + freqMap);
    }

    private static void fun9() {
        Map<String, Long> freqMap = words().stream()
                .collect(groupingBy(w -> w, counting()));

        freqMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(out::println);
    }

    private static void fun10() {
        Map<Integer, Set<String>> sizedWords = words().stream()
                .filter(w -> !w.isEmpty())
                .collect(groupingBy(w -> w.length(), toSet()));

        sizedWords.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(out::println);
    }

    private static void fun11() {
        Map<Integer, Set<String>> sizedWords = words().stream()
                .filter(w -> !w.isEmpty())
                .collect(groupingBy(w -> w.length(), TreeMap::new, toSet()));

        sizedWords.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
                .forEach(out::println);
    }


    public static List<String> words() {
        return Arrays.asList("test", "the", "fox", "jumped", "over", "the", "brown", "cow", "jumped", "over", "the", "moon");
    }
}

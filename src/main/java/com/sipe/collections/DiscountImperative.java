package com.sipe.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kensipe
 */
public class DiscountImperative {

    public static void main(String[] args) {
        imperative();
        functional();

    }

    public static void imperative() {
        final List<Integer> prices = Arrays.asList(10, 15, 20, 25, 30, 45, 50);

        final List<Double> discountedPrices = new ArrayList<>();

        for (int price : prices) {
            discountedPrices.add(price * 0.9);
        }

        System.out.println("prices:" + prices);
        System.out.println("discounts:" + discountedPrices);

    }

    public static void functional() {

        List<Integer> prices = Arrays.asList(10, 15, 20, 25, 30, 45, 50);

        final Stream<Double> discountedPrices = prices.stream().map(price -> price * 0.9);

        System.out.println("prices:" + prices);
        System.out.println("discounts:" + discountedPrices.collect(Collectors.toList()));

    }
}



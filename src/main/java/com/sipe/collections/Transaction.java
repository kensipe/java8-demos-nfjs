package com.sipe.collections;

import com.sipe.lambda.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author kensipe
 */
public class Transaction {

    private Person buyer;
    private Person seller;


    public static void main(String[] args) {

        List<Transaction> transactions = transactions();

        transactions.stream()
                .filter(t -> t.getBuyer().getAge() >= 65)
                .map(Transaction::getSeller)
                .distinct()
                .sorted(Comparator.comparing(s -> s.getLastName()))
                .forEach(s -> System.out.println(s.getFirstName()));

    }

    public static List<Transaction> transactions() {
        return new ArrayList<>();
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }
}

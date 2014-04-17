package com.sipe.lambda;

/**
 * @author kensipe
 */
public class RunnableExample {

    public static void main(String[] args) {

        Runnable runnable =() -> doStuff();
        runnable.run();

        System.out.println("main ");

    }

    private static void doStuff() {

        for (int i = 0; i < 10; i++) {
            System.out.println("thread " + i);
        }

    }
}

package com.sipe.files;

import java.io.File;
import java.util.Arrays;

public class ListFiles {

    public static void main(String[] args) {

        final String[] files = new File(".").list();
        Arrays.asList(files).forEach(System.out::println);
    }
}

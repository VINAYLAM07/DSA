package com.example.dsa.java8;

import java.util.Optional;

public class OrElse_OrElseGet {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Vinay");
        System.out.println(name.map(String::toUpperCase));

        System.out.println(name.orElse("Unknown"));

        System.out.println(name.orElseGet(() -> "Unknown"));

        Optional<String> empty = Optional.empty();

        System.out.println(empty.orElse("Unknown"));

        System.out.println(empty.orElseGet(() -> "Unknown"));

        System.out.println();



    }

}

package com.example.dsa.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {

//        System.out.println(isPositive.test(-1));
//        System.out.println(toUpper.apply("vinay"));
//        printIt.accept("vinay");
//        System.out.println(greet.get());
//        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14, 17, 20);
//        numbers.stream()
//                .filter(isEven)
//                .forEach(System.out::println);
        List<Integer> numbers1 =
                Arrays.asList(3, 7, 10, 12, 15, 18, 21, 24);
        numbers1.stream().filter(n->n>10 && n%2==0).map(n->n*n).forEach(System.out::println);
        List<String> names =
                Arrays.asList("vinay", "rahul", "amit", "suresh");
        names.stream().filter(n->n.length()>4).map(x-> x.toUpperCase()).forEach(System.out::println);



    }
    static Predicate<Integer> isPositive = x -> x>0 ;
    static Predicate<Integer> isEven= x -> x%2==0 ;

    static Function<String, String> toUpper = x-> x.toUpperCase();
    static Consumer<String> printIt = x ->System.out.println(x);
    static Supplier<String> greet = ()-> "Hello....";

}

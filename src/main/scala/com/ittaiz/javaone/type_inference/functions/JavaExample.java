package com.ittaiz.javaone.type_inference.functions;

import java.util.function.BiFunction;

public class JavaExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;

        System.out.println(adder.apply(5, 7));
    }

}


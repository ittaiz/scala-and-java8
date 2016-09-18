package com.ittaiz.javaone.type_inference.functions;

public class JavaExample {
    public static void main(String[] args) {

        Function2<Integer, Integer, Integer> adder = (a, b) -> a + b;

        System.out.println(adder.apply(5, 7));
    }

    @FunctionalInterface
    interface Function2 <A, B, R> {
        public R apply (A a, B b);
    }
}


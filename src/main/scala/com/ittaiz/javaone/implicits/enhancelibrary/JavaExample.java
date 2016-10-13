package com.ittaiz.javaone.implicits.enhancelibrary;

public class JavaExample {

    public static void main(String[] args) {
        SpringFWCode springFWInstance = new SpringFWCode(5);
        SpringFWCode otherSpringFWInstance = new SpringFWCode(7);
        System.out.println(accumulate(springFWInstance, otherSpringFWInstance));
    }

    private static SpringFWCode accumulate(SpringFWCode a, SpringFWCode b) {
        return new SpringFWCode(a.sum() + b.sum());
    }
}

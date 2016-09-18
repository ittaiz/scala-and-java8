package com.ittaiz.javaone.implicits.classtag;

public class JavaExample {

    public static <T> String deserialize(T t, Class<T> clazz) {
        return "deserializing " + clazz;
    }

    public static void main(String[] args) {

        String deserialized = deserialize(new SomeDomainObject("foo"), SomeDomainObject.class);

        System.out.println(deserialized);
    }
}

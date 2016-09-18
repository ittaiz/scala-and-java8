package com.ittaiz.javaone.implicits.enhancelibrary;

public class JavaExample {

    public static void main(String[] args) {
        SomeThirdPartyCode thirdPartyCode = new SomeThirdPartyCode(5);
        SomeThirdPartyCode otherThirdPartyCode = new SomeThirdPartyCode(7);
        System.out.println(accumulate(thirdPartyCode, otherThirdPartyCode));
    }

    private static SomeThirdPartyCode accumulate(SomeThirdPartyCode a, SomeThirdPartyCode b) {
        return new SomeThirdPartyCode(a.sum() + b.sum());
    }
}

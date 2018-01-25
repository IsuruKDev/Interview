package com.synergenhealth.interview.factory;

public class SamplePhone {

    public static void main(String[] args) {

        Phone android = PhoneFactory.getPhone(PhoneType.ANDROID);
        Phone iphone = PhoneFactory.getPhone(PhoneType.IPHONE);

        System.out.println(android);
        System.out.println("\n");
        System.out.println(iphone);
    }
}

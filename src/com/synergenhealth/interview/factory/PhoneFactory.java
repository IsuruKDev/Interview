package com.synergenhealth.interview.factory;


/*
*  Factory pattern is used create objects from factories
*  It doesn't expose instantiation logic
*  Sub classes creates the objects
* */
public class PhoneFactory {

    public static Phone getPhone(PhoneType phoneType){

        switch (phoneType){

            case ANDROID:
                return new AndroidPhone();
            case IPHONE:
                return new IPhone();
            default:
                return null;

        }
    }
}

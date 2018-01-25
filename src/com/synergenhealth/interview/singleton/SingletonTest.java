package com.synergenhealth.interview.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        singleton1.setI(11);
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setI(22);
        Singleton singleton3 = Singleton.getInstance();
        singleton2.setI(33);

        System.out.println(singleton1+" :: "+singleton1.getI());
        System.out.println(singleton2+" :: "+singleton2.getI());
        System.out.println(singleton3+" :: "+singleton3.getI());

        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton3 = BillPughSingleton.getInstance();

        System.out.println(billPughSingleton1);
        System.out.println(billPughSingleton2);
        System.out.println(billPughSingleton3);

        Runtime runtime1 = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();

        System.out.println(runtime1);
        System.out.println(runtime2);
    }
}

package com.synergenhealth.interview.factory;

public class IPhone extends Phone {
    @Override
    protected void createPhone() {
        specificationList.add(()-> System.out.println("12 MP Camera"));
        specificationList.add(()-> System.out.println("IDH Processor"));
        specificationList.add(()-> System.out.println("Amoiloid Display"));
    }

    @Override
    public String toString() {
        specificationList.stream().forEach(s -> s.description());
        return "iPhone";
    }
}

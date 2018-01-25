package com.synergenhealth.interview.factory;

public class AndroidPhone extends Phone {
    @Override
    protected void createPhone() {
        specificationList.add(()-> System.out.println("16 Mega pixel camera"));
        specificationList.add(()-> System.out.println("Snapdragon processor"));
        specificationList.add(()-> System.out.println("Gorilla Glass"));
    }

    @Override
    public String toString() {
        specificationList.stream().forEach(s -> s.description());
        return "Android";
    }
}

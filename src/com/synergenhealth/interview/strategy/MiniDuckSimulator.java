package com.synergenhealth.interview.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallarDuck();
        mallard.setFlyBehavior(()-> System.out.println("Flying sucks"));
        mallard.setQuackBehavior(()-> System.out.println("Quack"));

        mallard.performFly();
        mallard.performQuack();
        mallard.display();
    }
}

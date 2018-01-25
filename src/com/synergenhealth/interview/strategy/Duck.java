package com.synergenhealth.interview.strategy;
/*
* The Strategy Pattern defines a family of algorithms,
* encapsulate each one, and makes them interchangeable.
* Strategy lets the algorithm vary independently from
* clients that use it.
* */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public abstract void display();

    protected void performQuack(){
        quackBehavior.quack();
    }

    protected void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks floating, even decoys");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

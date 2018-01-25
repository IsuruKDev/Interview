package com.synergenhealth.interview.singleton;

public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton(){}

    private int i = 0;

    public static Singleton getInstance(){

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }

        return instance;

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

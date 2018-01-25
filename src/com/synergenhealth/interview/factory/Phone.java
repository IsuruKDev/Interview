package com.synergenhealth.interview.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    protected List<Specification> specificationList = new ArrayList<>();

    public Phone(){
        createPhone();
    }

    protected abstract void createPhone();

}

package com.paypal.test.impl;

import com.paypal.test.api.Car;
import com.paypal.test.api.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Corolla implements Car {

    @Autowired
    @Qualifier("engineType")
    Engine engine;


    public String specs() {
        String specs = "Sedan from Toyota with engine type " + engine.type();
        return specs;
    }



}

package com.paypal.test.specs;

import com.paypal.test.api.Engine;

public class EngineType implements Engine {

    String type;

    public EngineType() {
        type = "unknown";
    }

    public EngineType(String type) {
        this.type = type;
    }

    @Override
    public String type() {
        return type;
    }

}

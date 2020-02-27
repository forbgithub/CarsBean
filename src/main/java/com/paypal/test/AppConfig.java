package com.paypal.test;

import com.paypal.test.impl.Corolla;
import com.paypal.test.impl.Swift;
import com.paypal.test.specs.EngineType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.studyeasy")
public class AppConfig {

    @Bean("myCorolla")
    public Corolla corolla() {
        return new Corolla();
    }

    @Bean("swift")
    public Swift swift() {
        return new Swift();
    }

    @Bean("engineType")
    public EngineType engineType() {
        return new EngineType("V8 engine");
    }

}

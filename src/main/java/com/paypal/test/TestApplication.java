package com.paypal.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.paypal.test.api.Car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new	AnnotationConfigApplicationContext(AppConfig.class);

		Car myCar =  context.getBean("myCorolla", Car.class);
		System.out.println(myCar.specs());
		context.close();

	}
}

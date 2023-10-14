package de.mhei.spring.diexample;

import de.mhei.spring.diexample.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiexampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiexampleApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);

		System.out.println("In Main method");

		System.out.println(myController.sayHello());

	}



}

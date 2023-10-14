package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.GreetingService;
import de.mhei.spring.diexample.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * @author marcusheisters
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello() {
        System.out.println("Im in the controller.");
        return greetingService.sayGreeting();
    }

}

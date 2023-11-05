package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author marcusheisters
 */
@Controller
public class Myi18NController {

    private final GreetingService greetingService;

    public Myi18NController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

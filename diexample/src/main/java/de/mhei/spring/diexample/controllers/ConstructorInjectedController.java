package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author marcusheisters
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

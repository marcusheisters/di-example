package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.GreetingService;

/**
 * @author marcusheisters
 */
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

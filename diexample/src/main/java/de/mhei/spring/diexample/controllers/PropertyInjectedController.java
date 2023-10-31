package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author marcusheisters
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("greetingServicePropertyInjection")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

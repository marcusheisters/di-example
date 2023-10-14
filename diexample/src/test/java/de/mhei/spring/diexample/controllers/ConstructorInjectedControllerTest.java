package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.GreetingService;
import de.mhei.spring.diexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author marcusheisters
 */
class ConstructorInjectedControllerTest {

    GreetingService greetingService;
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        greetingService = new GreetingServiceImpl();
        controller = new ConstructorInjectedController(greetingService);
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}
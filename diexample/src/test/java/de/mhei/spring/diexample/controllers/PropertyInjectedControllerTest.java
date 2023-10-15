package de.mhei.spring.diexample.controllers;

import de.mhei.spring.diexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author marcusheisters
 */
@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;


    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}

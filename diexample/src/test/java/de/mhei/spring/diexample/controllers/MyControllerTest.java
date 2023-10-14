package de.mhei.spring.diexample.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author marcusheisters
 */
class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();

        System.out.println(myController.sayHello());
    }
}
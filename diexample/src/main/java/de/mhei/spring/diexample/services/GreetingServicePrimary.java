package de.mhei.spring.diexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author marcusheisters
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greetings from the Primary Service";
    }
}

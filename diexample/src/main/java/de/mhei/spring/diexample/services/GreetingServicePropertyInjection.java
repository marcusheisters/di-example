package de.mhei.spring.diexample.services;

import org.springframework.stereotype.Service;

/**
 * @author marcusheisters
 */
@Service
public class GreetingServicePropertyInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends dont let friends do property injection!";
    }
}

package de.mhei.spring.diexample.services;

import org.springframework.stereotype.Service;

/**
 * @author marcusheisters
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from base service";
    }
}

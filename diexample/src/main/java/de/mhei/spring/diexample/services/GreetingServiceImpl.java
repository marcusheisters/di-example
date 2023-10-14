package de.mhei.spring.diexample.services;

/**
 * @author marcusheisters
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from base service";
    }
}

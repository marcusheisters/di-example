package de.mhei.spring.diexample.services.i18n;

import de.mhei.spring.diexample.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author marcusheisters
 */
@Profile("GR")
@Service("i18NService")
public class GreekGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Yia sas!";
    }
}

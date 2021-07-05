package pl.bejot.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PL")
@Service("i18nService")
public class I18nPolishGreetingService implements GreetingService {
    @Override
    public String helloWorld() {
        return "Witaj Świecie! - PL";
    }
}

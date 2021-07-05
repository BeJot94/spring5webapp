package pl.bejot.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"PATO", "default"})
@Service("i18nService")
public class I18nDefaultGreetingService implements GreetingService {
    @Override
    public String helloWorld() {
        return "SIEMA ŚWIATKU! - DEFAULT";
    }
}

package pl.bejot.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String helloWorld() {
        return "Hello World! - Constructor";
    }
}

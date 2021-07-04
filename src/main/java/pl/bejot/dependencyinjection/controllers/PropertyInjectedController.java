package pl.bejot.dependencyinjection.controllers;

import pl.bejot.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.helloWorld();
    }
}

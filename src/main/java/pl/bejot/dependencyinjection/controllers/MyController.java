package pl.bejot.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import pl.bejot.dependencyinjection.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld() {
        return greetingService.helloWorld();
    }
}

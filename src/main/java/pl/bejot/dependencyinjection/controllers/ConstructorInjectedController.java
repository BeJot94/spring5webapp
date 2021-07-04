package pl.bejot.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import pl.bejot.dependencyinjection.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // In Constructor Injection @Autowired annotation isn't required,
    // because constructor is the only way to instantiate the final property.
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.helloWorld();
    }
}

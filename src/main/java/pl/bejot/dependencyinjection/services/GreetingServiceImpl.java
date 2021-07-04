package pl.bejot.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String helloWorld() {
        return "Hello World!";
    }
}

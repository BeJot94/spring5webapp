package pl.bejot.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld() {
        System.out.println("Hello World!");

        return "Hello you person!";
    }
}

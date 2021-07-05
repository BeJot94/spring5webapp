package pl.bejot.dependencyinjection.controllers;

import pl.bejot.dependencyinjection.services.PetService;

public class PetController {

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}

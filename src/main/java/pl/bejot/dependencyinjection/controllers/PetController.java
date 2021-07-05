package pl.bejot.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.bejot.dependencyinjection.services.PetService;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(@Qualifier("petService") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}

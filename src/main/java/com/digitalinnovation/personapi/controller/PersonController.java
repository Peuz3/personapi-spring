package com.digitalinnovation.personapi.controller;

import com.digitalinnovation.personapi.dto.request.PersonDTO;
import com.digitalinnovation.personapi.exceptions.ParsonNotFoundException;
import com.digitalinnovation.personapi.service.PersonService;
import com.digitalinnovation.personapi.dto.MessageResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {

        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){

        return personService.createPerson(personDTO);
    }

    public List<PersonDTO> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws ParsonNotFoundException {
        return personService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws ParsonNotFoundException {
        personService.delete(id);

    }



}

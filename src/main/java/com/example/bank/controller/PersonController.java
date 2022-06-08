package com.example.bank.controller;

import com.example.bank.business.PersonService;
import com.example.bank.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@RequestMapping(value = "persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity<List<PersonModel>> findAllPersons(){
        return ResponseEntity.ok(personService.findPersons());
    }

    @GetMapping(value = "/dni", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonModel findPersonByDni(@RequestBody String dni) {
        //return carService.findCarByModel(model);
        return personService.findByDni(dni);
    }

    @PostMapping
    public ResponseEntity<PersonModel> create(@Valid @RequestBody PersonModel person){
        PersonModel response = personService.create(person);
        return new ResponseEntity<PersonModel>(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PersonModel> update(@Valid @RequestBody PersonModel person){
        PersonModel response = personService.update(person);
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        personService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

package com.example.bank.controller;

import com.example.bank.business.CreditService;
import com.example.bank.model.CreditModel;
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
@RequestMapping(value = "credits")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping
    public List<CreditModel> findAllCredits(){
        return creditService.findCredits();
    }

    @GetMapping(value = "/nrocredito", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreditModel findCreditByNro(@RequestBody String nrocredito) {
        return creditService.findByNroCredito(nrocredito);
    }
    @PostMapping
    public ResponseEntity<CreditModel> create(@Valid @RequestBody CreditModel credit){
        CreditModel response = creditService.create(credit);
        return new ResponseEntity<CreditModel>(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CreditModel> update(@Valid @RequestBody CreditModel credit){
        CreditModel response = creditService.update(credit);
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        creditService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

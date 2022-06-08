package com.example.bank.controller;

import com.example.bank.business.CompanyService;
import com.example.bank.model.CompanyModel;
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
@RequestMapping(value = "companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<CompanyModel> findAllCompanies(){
        return companyService.findCompanies();
    }

    @GetMapping(value = "/ruc", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyModel findCompanyByRuc(@RequestBody String ruc) {
        return companyService.findByRuc(ruc);
    }

    @PostMapping
    public ResponseEntity<CompanyModel> create(@Valid @RequestBody CompanyModel company){
        CompanyModel response = companyService.create(company);
        return new ResponseEntity<CompanyModel>(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CompanyModel> update(@Valid @RequestBody CompanyModel company){
        CompanyModel response = companyService.update(company);
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        companyService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

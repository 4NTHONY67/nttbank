package com.example.bank.controller;

import com.example.bank.business.AccountService;
import com.example.bank.model.AccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@RequestMapping(value = "accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<AccountModel> findAllAccounts(){
        return accountService.findAccounts();
    }

    @GetMapping(value = "/nrocuenta", consumes = MediaType.TEXT_PLAIN_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountModel findAccountByNro(@RequestBody String nrocuenta) {
        return accountService.findByAccount(nrocuenta);
    }
    @PostMapping
    public ResponseEntity<AccountModel> create(@Valid @RequestBody
        AccountModel account) {
        AccountModel response = accountService.create(account);
        return new ResponseEntity<AccountModel>(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<AccountModel> update(@Valid @RequestBody
        AccountModel account) {
        AccountModel response = accountService.update(account);
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        accountService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}

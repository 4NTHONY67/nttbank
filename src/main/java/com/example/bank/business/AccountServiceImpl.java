package com.example.bank.business;

import com.example.bank.model.AccountModel;
import com.example.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements  AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<AccountModel> findAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public AccountModel findByAccount(String nrocuenta) {
        return accountRepository.findByAccount(nrocuenta);
    }

    @Override
    public AccountModel create(AccountModel account) {
        return accountRepository.save(account);
    }

    @Override
    public AccountModel update(AccountModel account) {
        return accountRepository.save(account);
    }

    @Override
    public void delete(String id) {
        accountRepository.deleteById(id);
    }
}

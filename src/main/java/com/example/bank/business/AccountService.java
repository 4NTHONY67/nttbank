package com.example.bank.business;

import com.example.bank.model.AccountModel;

import java.util.List;

public interface AccountService {

    List<AccountModel> findAccounts();
    AccountModel findByAccount(String nrocuenta);
    AccountModel create(AccountModel account);
    AccountModel update(AccountModel account);
    void delete(String id);
}

package com.example.bank.business;

import com.example.bank.model.CreditModel;

import java.util.List;

public interface CreditService {

    List<CreditModel> findCredits();
    CreditModel findByNroCredito(String nrocredito);
    CreditModel create(CreditModel credit);
    CreditModel update(CreditModel credit);
    void delete(String id);
}

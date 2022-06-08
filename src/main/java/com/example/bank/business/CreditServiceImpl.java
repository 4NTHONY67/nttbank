package com.example.bank.business;

import com.example.bank.model.CreditModel;
import com.example.bank.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditServiceImpl implements  CreditService{

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public List<CreditModel> findCredits() {
        return creditRepository.findAll();
    }

    @Override
    public CreditModel findByNroCredito(String nrocredito) {
        return creditRepository.findByNroCredito(nrocredito);
    }

    @Override
    public CreditModel create(CreditModel credit) {
        return creditRepository.save(credit);
    }

    @Override
    public CreditModel update(CreditModel credit) {
        return creditRepository.save(credit);
    }

    @Override
    public void delete(String id) {
        creditRepository.deleteById(id);
    }
}

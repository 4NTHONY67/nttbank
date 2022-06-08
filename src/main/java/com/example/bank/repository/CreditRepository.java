package com.example.bank.repository;

import com.example.bank.model.CreditModel;
import com.example.bank.model.PersonModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CreditRepository extends MongoRepository<CreditModel, String> {

    @Query("{nrocredito: ?0}")
    CreditModel findByNroCredito(String nrocredito);
}

package com.example.bank.repository;

import com.example.bank.model.CompanyModel;
import com.example.bank.model.CreditModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CompanyRepository extends MongoRepository<CompanyModel, String> {

    @Query("{ruc: ?0}")
    CompanyModel findByRuc(String ruc);
}

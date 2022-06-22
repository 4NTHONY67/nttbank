package com.example.bank.repository;

import com.example.bank.model.AccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import reactor.core.publisher.Flux;

public interface AccountRepository extends MongoRepository<AccountModel, String> {

    @Query("{nrocuenta: ?0}")
    AccountModel findByAccount(String nrocuenta);

}

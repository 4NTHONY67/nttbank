package com.example.bank.repository;

import com.example.bank.model.PersonModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<PersonModel, String>  {

    @Query("{dni: ?0}")
    PersonModel findByDni(String dni);
}

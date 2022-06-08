package com.example.bank.business;

import com.example.bank.model.PersonModel;
import com.example.bank.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{


    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PersonModel> findPersons() {
        return personRepository.findAll();
    }

    @Override
    public PersonModel findByDni(String dni) {
        return personRepository.findByDni(dni);
    }

    @Override
    public PersonModel create(PersonModel person) {
        return personRepository.save(person);
    }

    @Override
    public PersonModel update(PersonModel person) {
        return personRepository.save(person);
    }

    @Override
    public void delete(String id) {
       personRepository.deleteById(id);
    }
}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service 
public class PersonService {

    private final PersonDao PersonDao;

    @Autowired
    public PersonService(@Qualifier("postgres") PersonDao personDao) {
        this.PersonDao = personDao;
    }

    public int addPerson(Person person) {
        return PersonDao.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return PersonDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return PersonDao.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return PersonDao.deletePersonById(id);
    }
    
    public int updatePerson(UUID id, Person newperson) {
        return PersonDao.updatePersonById(id, newperson);
    }
}
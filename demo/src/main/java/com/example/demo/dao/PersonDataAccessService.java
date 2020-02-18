package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {

    @Override
    public int insertPerson(final UUID id, final Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return Arrays.asList(new Person(UUID.randomUUID(), "postgres"));
		//return List.class(new Person(UUID.randomUUID(), "postgres"));
    }

    @Override
    public Optional<Person> selectPersonById(final UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int deletePersonById(final UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updatePersonById(final UUID id, final Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

}
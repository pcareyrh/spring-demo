package com.example.demo.dao;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public int insertPerson(final UUID id, final Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        final String sql = "SELECT id, name FROM person";
        List<Person> people = jdbcTemplate.query(sql, (ResultSet, i) -> {
            UUID id = UUID.fromString(ResultSet.getString("id"));
            String name = ResultSet.getString("name");
            return new Person(id, name);
        });
        return people;
      //  return Arrays.asList(new Person(UUID.randomUUID(), "postgres"));
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
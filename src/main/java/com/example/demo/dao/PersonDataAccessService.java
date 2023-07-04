package com.example.demo.dao;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Person;

@Repository("postgres")
public class PersonDataAccessService implements Persondao{
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }
    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));
    }
    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }
    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }
    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
    
}
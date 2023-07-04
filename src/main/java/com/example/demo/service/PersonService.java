package com.example.demo.service;
import java.util.*;
import com.example.demo.dao.Persondao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final Persondao persondao;
    
    @Autowired
    public PersonService(@Qualifier("postgres") Persondao persondao){
        this.persondao = persondao;
    }
    public int addPerson(Person person){
        return persondao.insertPerson(person);
    }
    public List<Person> getAllPeople(){
        return persondao.selectAllPeople();
    }
    public Optional<Person> getPersonById(UUID id){
        return persondao.selectPersonById(id);
    }
    public int deletePerson(UUID id){
        return persondao.deletePersonById(id);
    }
    public int updatePerson(UUID id, Person newPerson){
        return persondao.updatePersonById(id, newPerson);
    }
}

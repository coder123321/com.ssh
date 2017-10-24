package com.ssh.service;

import com.ssh.dao.PersonDao;
import com.ssh.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private PersonDao personDao;

    public String test() {
        return "test";
    }

    public Person findById(Integer id){
        Person p = personDao.get(id);
        return  p;
    }
    public int savePerson(Person p ){
        Integer i  = personDao.save(p);
        return  i;
    }
}

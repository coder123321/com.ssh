package com.ssh.dao;

import com.ssh.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoimpl implements  PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public Person get(Integer id) {
        return (Person)getCurrentSession().get(Person.class,id);
    }
    public Integer save(Person entity) {
        return (Integer) getCurrentSession().save(entity);
    }

}

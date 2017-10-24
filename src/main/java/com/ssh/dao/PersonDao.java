package com.ssh.dao;

import com.ssh.entity.Person;

import java.util.List;

public interface PersonDao {

     Person get(Integer id) ;

     Integer save(Person entity);

}

package com.shubham.spring.JPA.spring.JPA.demo.service;

import com.shubham.spring.JPA.spring.JPA.demo.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository  //Since this service interacts with the database
@Transactional  //Since to make change to database we need a transaction, this provides the transaction to every method of the entity
public class UserDaoService {

    @PersistenceContext  //This links persistenceContext to EntityManager
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);   //For EntityManager to track the entity it should be in persistence Context
        return user.getId();
    }
}

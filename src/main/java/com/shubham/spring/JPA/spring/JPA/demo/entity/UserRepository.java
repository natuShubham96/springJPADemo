package com.shubham.spring.JPA.spring.JPA.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;


//JpaRepository is used to implement Spring Jpa, here User is theentity and Long is the data type of the primary key declared
public interface UserRepository extends JpaRepository<User, Long> {
}

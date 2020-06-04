package com.shubham.spring.JPA.spring.JPA.demo;

import com.shubham.spring.JPA.spring.JPA.demo.entity.User;
import com.shubham.spring.JPA.spring.JPA.demo.entity.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component  //Since it will be managed by Spring Boot
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    private Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Override   //Since we are implementing CommandLineRunner interface, hence we need to override this method
    public void run(String... args) throws Exception {
        User user = new User("Jill","Admin");
        userRepository.save(user);  //Making the user entity persist through the DaoService created and it stores the user in the database

        //save() can be used for insert and update both

        Optional<User> userWithId = userRepository.findById(1L);

        logger.info("User with id"+userWithId);

        List<User> users = userRepository.findAll();

        logger.info("Users list"+users);

        logger.info("User Saved"+user);
    }
}

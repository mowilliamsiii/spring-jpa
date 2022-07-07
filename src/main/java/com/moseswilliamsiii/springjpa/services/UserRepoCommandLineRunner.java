package com.moseswilliamsiii.springjpa.services;

import com.moseswilliamsiii.springjpa.model.User;
import com.moseswilliamsiii.springjpa.repositories.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepoCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepoCommandLineRunner.class);

    @Autowired
    private UserRepo userRepo;
    @Override
    public void run(String... args) throws Exception {
        User user  = new User("Tom", "Admin");
        userRepo.save(user);
        log.info("New user is created: " + user);

        Optional<User> userWithIdOne = userRepo.findById(1L);
        log.info("User is retrived: " + userWithIdOne);

        List<User> users = userRepo.findAll();
        log.info("All users: " + users);
    }
}

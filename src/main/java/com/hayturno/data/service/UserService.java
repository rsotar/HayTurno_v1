package com.hayturno.data.service;

import com.hayturno.entities.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    List<User> findAll();


    @Transactional(propagation = Propagation.REQUIRED)
    User addUser(User user);

    void deleteUser(int id);
}

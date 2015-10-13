package com.hayturno.data.service;

import com.hayturno.data.repository.UserRepository;
import com.hayturno.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

    @PersistenceContext
    private EntityManager entityManager;

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {

        return (List<User>)  userRepository.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User addUser(User user) {

            return userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {

        userRepository.delete(id);
        entityManager.flush();
    }
}

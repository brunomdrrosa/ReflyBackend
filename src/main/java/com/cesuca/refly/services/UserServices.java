package com.cesuca.refly.services;

import com.cesuca.refly.entities.User;
import com.cesuca.refly.exceptions.HttpClientErrorException;
import com.cesuca.refly.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    PasswordEncoder passwordEncoder;

    public UserServices(UserRepository userRepository) {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @SuppressWarnings("rawtypes")
    @Transactional(readOnly = true)
    public List<User> findAllUsers(List list) {
        return repository.findAll();
    }

    @Transactional
    public User addUser(User newUser) {
        if (repository.findByEmail(newUser.getEmail()) != null) {
            throw new HttpClientErrorException("O e-mail informado já existe no sistema");
        }
        String encodedPassword = this.passwordEncoder.encode(newUser.getPassword());
        newUser.setPassword(encodedPassword);
        return repository.saveAndFlush(newUser);
    }
}

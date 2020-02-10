package com.wex.test.laercio.demo.service;

import com.wex.test.laercio.demo.model.User;
import com.wex.test.laercio.demo.model.UserWithMovie;
import com.wex.test.laercio.demo.repository.UserRepository;
import com.wex.test.laercio.demo.repository.UserWithMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserWithMovieRepository userWithMovieRepository;
    @Autowired
    private UserRepository userRepository;

    public Iterable<UserWithMovie> findAllUserWithMovie() {
        return userWithMovieRepository.findAll();
    }

    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}

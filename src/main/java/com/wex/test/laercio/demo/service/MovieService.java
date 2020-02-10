package com.wex.test.laercio.demo.service;

import com.wex.test.laercio.demo.model.MovieWithUser;
import com.wex.test.laercio.demo.repository.MovieWithUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieWithUserRepository movieWithUserRepository;

    public Iterable<MovieWithUser> findAllMovieWithUser() {
        return movieWithUserRepository.findAll();
    }
}

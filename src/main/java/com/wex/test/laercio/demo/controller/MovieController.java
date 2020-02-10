package com.wex.test.laercio.demo.controller;

import com.wex.test.laercio.demo.model.MovieWithUser;
import com.wex.test.laercio.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movieWithUser")
    private Iterable<MovieWithUser> getAllMovieWithUser() {
        return movieService.findAllMovieWithUser();
    }
}

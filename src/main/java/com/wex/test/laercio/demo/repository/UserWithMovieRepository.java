package com.wex.test.laercio.demo.repository;

import com.wex.test.laercio.demo.model.UserWithMovie;
import org.springframework.data.repository.CrudRepository;

public interface UserWithMovieRepository extends CrudRepository<UserWithMovie, Integer> {
}

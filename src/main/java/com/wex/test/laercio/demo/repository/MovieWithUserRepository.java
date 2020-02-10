package com.wex.test.laercio.demo.repository;

import com.wex.test.laercio.demo.model.MovieWithUser;
import org.springframework.data.repository.CrudRepository;

public interface MovieWithUserRepository extends CrudRepository<MovieWithUser, Integer> {
}

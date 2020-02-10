package com.wex.test.laercio.demo;

import com.wex.test.laercio.demo.model.Movie;
import com.wex.test.laercio.demo.model.User;
import com.wex.test.laercio.demo.repository.MovieRepository;
import com.wex.test.laercio.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitDb implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Movie> movieList = new ArrayList<>();
        List<User> userList = new ArrayList<>();

        movieList.add(
                Movie.builder()
                .movieId(1)
                .title("ASSASSIN'S CREED: EMBER")
                .category("Animations")
                .build()
        );

        movieList.add(Movie.builder()
                .movieId(2)
                .title("Real Steel (2012)")
                .category("Animations")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(3)
                .title("Alvim and the Chipmunks")
                .category("Animations")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(4)
                .title("The Adventures of Tin Tin")
                .category("Animations")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(5)
                .title("Safe (2012)")
                .category("Action")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(6)
                .title("Safe House (2012)")
                .category("Action")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(7)
                .title("GIA")
                .category("+18")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(8)
                .title("Deadline 2009")
                .category("+18")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(9)
                .title("The Dirty Picture")
                .category("+18")
                .build()
        );
        movieList.add(Movie.builder()
                .movieId(10)
                .title("Marley and Me")
                .category("Romance")
                .build()
        );


        userList.add(User.builder()
                .userId(1)
                .firstName("Adam")
                .lastName("Smith")
                .movie(movieList.get(0))
                .build()
        );

        userList.add(User.builder()
                .userId(2)
                .firstName("Ravi")
                .lastName("Kumar")
                .movie(movieList.get(1))
                .build()
        );

        userList.add(User.builder()
                .userId(3)
                .firstName("Susan")
                .lastName("Davidson")
                .movie(movieList.get(4))
                .build()
        );

        userList.add(User.builder()
                .userId(4)
                .firstName("Jenny")
                .lastName("Adrianna")
                .movie(movieList.get(7))
                .build()
        );

        userList.add(User.builder()
                .userId(6)
                .firstName("Lee")
                .lastName("Pong")
                .movie(movieList.get(9))
                .build()
        );

        movieList.forEach(m -> movieRepository.save(m));
        userList.forEach(u -> userRepository.save(u));
    }
}

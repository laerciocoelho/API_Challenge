package com.wex.test.laercio.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "tb_movies")
public class MovieWithUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int movieId;
    private String title;
    @JsonIgnore
    private String category;

    @OneToMany
    @JoinColumn(name = "movie_id")
    @JsonIgnoreProperties({ "userId" , "movie"})
    private List<User> renters;
}

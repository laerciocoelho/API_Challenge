package com.wex.test.laercio.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

// Lombok
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
// JPA
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}

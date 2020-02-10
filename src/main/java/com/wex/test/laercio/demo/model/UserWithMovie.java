package com.wex.test.laercio.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class UserWithMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}

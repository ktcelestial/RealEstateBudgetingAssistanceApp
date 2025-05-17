package com.example.bjprea.backend_java_prea.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserAccts")
public class UserAccEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    /*
    nullable = can not be empty, unique = must be different than every previous entry of that field in database
     */

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "DOB_date")
    private String DOB;

    @Column(name = "ac_username", nullable = false, unique = true)
    private String ac_username;
    @Column(name = "ac_password")
    private String ac_password;


}

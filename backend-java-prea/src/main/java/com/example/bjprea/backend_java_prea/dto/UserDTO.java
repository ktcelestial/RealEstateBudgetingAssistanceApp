package com.example.bjprea.backend_java_prea.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    // DTO: Data Transfer objects*
    // Data going to the  database. Follow security practices
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

}

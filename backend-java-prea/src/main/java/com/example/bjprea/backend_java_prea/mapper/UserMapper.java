package com.example.bjprea.backend_java_prea.mapper;

import com.example.bjprea.backend_java_prea.dto.UserDTO;
import com.example.bjprea.backend_java_prea.entity.UserAccEntity;

public class UserMapper {

    public static UserDTO mapToUserDTO(UserAccEntity UAE) {

        return new UserDTO(
                UAE.getId(),
                UAE.getFirstName(),
                UAE.getLastName(),
                UAE.getEmail(),
                UAE.getDOB(),
                UAE.getAcusername(),
                UAE.getAcpassword()
        );
    }

    public static UserAccEntity mapToUserAccEntity(UserDTO userDTO) {

        return new UserAccEntity(
                userDTO.getIdDTO(),
                userDTO.getFirstNameDTO(),
                userDTO.getLastNameDTO(),
                userDTO.getEmailDTO(),
                userDTO.getDOBDTO(),
                userDTO.getAcusernameDTO(),
                userDTO.getAcpasswordDTO()

        );
    }
}

package com.example.bjprea.backend_java_prea.mapper;

import com.example.bjprea.backend_java_prea.dto.UserDTO;
import com.example.bjprea.backend_java_prea.entity.UserAccEntity;

public class UserMapper {

    public static UserDTO mapToEmplyeeDTO(UserAccEntity UAE) {
        return new UserDTO();
    }


}

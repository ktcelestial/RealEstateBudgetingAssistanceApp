package com.example.bjprea.backend_java_prea.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class UserDTO {
    // DTO: Data Transfer objects*
    // Data going to the  database. Follow security practices
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String DOB;
    private String acusername;
    private String acpassword;

    // No Args
    public UserDTO() {}

    // All Args
    public UserDTO(Long ID, String FN, String LN, String EMAIL, String DOB, String ACUN, String ACPW) {
        this.id = ID;
        this.firstName = FN;
        this.lastName = LN;
        this.email = EMAIL;
        this.DOB = DOB;
        this.acusername = ACUN;
        this.acpassword = ACPW;
    }


    public Long getIdDTO() {
        return id;
    }

    public String getFirstNameDTO() {
        return firstName;
    }

    public String getLastNameDTO() {
        return lastName;
    }

    public String getEmailDTO() {
        return email;
    }

    public String getDOBDTO() {
        return DOB;
    }

    public String getAcusernameDTO() {
        return acusername;
    }

    public String getAcpasswordDTO() {
        return acpassword;
    }

}

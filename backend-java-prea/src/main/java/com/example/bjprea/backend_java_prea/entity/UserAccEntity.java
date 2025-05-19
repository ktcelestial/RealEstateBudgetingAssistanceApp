package com.example.bjprea.backend_java_prea.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;

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
    private String acusername;
    @Column(name = "ac_password")
    private String acpassword;

    // No Args
    public UserAccEntity() {}

    // All Args
    public UserAccEntity(Long ID, String FN, String LN, String EMAIL, String DOB, String ACUN, String ACPW) {
        this.id = ID;
        this.firstName = FN;
        this.lastName = LN;
        this.email = EMAIL;
        this.DOB = DOB;
        this.acusername = ACUN;
        this.acpassword = ACPW;
    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAcusername() {
        return acusername;
    }

    public String getAcpassword() {
        return acpassword;
    }
}

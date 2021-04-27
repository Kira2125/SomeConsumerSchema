package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Validated
@Data
@Entity
@Table(name = "credentials")
public class LoginRequestDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "login")
    @JsonProperty("login")
    private String login;
    @Column(name = "password")
    @JsonProperty("password")
    private String password;
}
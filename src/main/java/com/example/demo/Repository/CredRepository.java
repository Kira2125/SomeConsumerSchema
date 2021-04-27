package com.example.demo.Repository;

import com.example.demo.DTO.LoginRequestDto;
import com.example.demo.DTO.UserDTO;

public interface CredRepository {
    LoginRequestDto addToDB(LoginRequestDto loginRequestDto);
}

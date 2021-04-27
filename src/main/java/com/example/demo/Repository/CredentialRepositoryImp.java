package com.example.demo.Repository;

import com.example.demo.DTO.LoginRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CredentialRepositoryImp implements CredRepository {
    @Autowired
    private CredentialRepository credRepository;

    @Override
    public LoginRequestDto addToDB(LoginRequestDto loginRequestDto) {
        return credRepository.save(loginRequestDto);
    }
}

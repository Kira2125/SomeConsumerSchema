package com.example.demo.Repository;

import com.example.demo.DTO.LoginRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<LoginRequestDto, Long> {
}

package com.example.demo.repository;

import com.example.demo.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminReposotry extends JpaRepository<AdminEntity, Long> {

     Optional<AdminEntity> findOneByEmailAndPassword(String email, String password);
}

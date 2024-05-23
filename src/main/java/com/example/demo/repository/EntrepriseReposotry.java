package com.example.demo.repository;

import com.example.demo.entity.EntrepriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseReposotry  extends JpaRepository<EntrepriseEntity, Long> {

    // EntrepriseEntity findEntreprisecode(Long id);

    static void deleteAllEntreprises() {
    }

}

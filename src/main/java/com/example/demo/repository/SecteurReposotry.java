package com.example.demo.repository;

import com.example.demo.entity.SecteurEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurReposotry extends JpaRepository<SecteurEntity, Long> {

    static void deleteAllSecteurs() {
    }
}




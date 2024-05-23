package com.example.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EntrepriseEntity;
import com.example.demo.repository.EntrepriseReposotry;


import java.util.ArrayList;
import java.util.List;

@Service
public class EntrepriseDao {


    @Autowired
    private EntrepriseReposotry entrepriseReposotry;

    public EntrepriseEntity AddEntreprise(EntrepriseEntity entreprise){
        return  this.entrepriseReposotry.save(entreprise);
    }

    public EntrepriseEntity addEntreprise(EntrepriseEntity entreprise) {
        return entrepriseReposotry.save(entreprise);
    }

    public List<EntrepriseEntity> addAllEntreprises(List<EntrepriseEntity> entreprises) {
        List<EntrepriseEntity> addedEntreprises = new ArrayList<>();
        for (EntrepriseEntity entreprise : entreprises) {
            addedEntreprises.add(addEntreprise(entreprise));
        }
        return addedEntreprises;
    }

    public List<EntrepriseEntity>getAllEntreprises(){
        return this.entrepriseReposotry.findAll();
    }

    public EntrepriseEntity getEntrepriseById(Long entrepriseId) {
        return this.entrepriseReposotry.findById(entrepriseId).orElse(null);
    }

    public void deleteEntrepriseById(Long entrepriseId) {
        this.entrepriseReposotry.deleteById(entrepriseId);
    }

    public List<EntrepriseEntity> deleteAllEntreprises() {
        this.entrepriseReposotry.deleteAll();
        return null;
    }
}
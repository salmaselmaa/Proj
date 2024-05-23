package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "entreprise")
@Data

public class EntrepriseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;
    private String description;
    private String horaire;

    @ManyToOne
    @JoinColumn(name = "secteur_id")
    @JsonBackReference
    private SecteurEntity secteur;
}
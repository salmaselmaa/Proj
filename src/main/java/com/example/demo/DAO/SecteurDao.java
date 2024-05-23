package com.example.demo.DAO;

import com.example.demo.entity.SecteurEntity;
import com.example.demo.repository.SecteurReposotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecteurDao {

    @Autowired
    private SecteurReposotry secteurReposotry;

    public SecteurEntity AddSecteur(SecteurEntity secteur) {
        return this.secteurReposotry.save(secteur);
    }

    public SecteurEntity addSecteur(SecteurEntity secteur) {
        return secteurReposotry.save(secteur);
    }

    public List<SecteurEntity> addAllSecteurs(List<SecteurEntity> secteurs) {
        List<SecteurEntity> addedSecteurs= new ArrayList<>();
        for (SecteurEntity secteur : secteurs) {
            addedSecteurs.add(addSecteur(secteur));
        }
        return addedSecteurs;
    }

    public void deleteSecteurById(Long secteurId) {
        this.secteurReposotry.deleteById(secteurId);
    }

    public List<SecteurEntity> deleteAllSecteurs() {
        this.secteurReposotry.deleteAll();
        return null;
    }


    public List<SecteurEntity> getAllSecteurs(){
        return this.secteurReposotry.findAll();
    }

    public SecteurEntity getSecteurById(Long secteurId) {
        return this.secteurReposotry.findById(secteurId).orElse(null);
    }
}


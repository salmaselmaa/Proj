package com.example.demo.Controller;

import com.example.demo.DAO.SecteurDao;
import com.example.demo.entity.SecteurEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/Secteur")
@RestController
@CrossOrigin//("http://localhost:4200")
public class SecteurController {

    @Autowired
    private SecteurDao secteurDao;

    @PostMapping(path = "/addSecteur")
    public SecteurEntity addSecteur(@RequestBody SecteurEntity secteur) {
        return this.secteurDao.AddSecteur(secteur);
    }

    @PostMapping(path = "/addAllsec")
    public List<SecteurEntity> addAllSecteurs(@RequestBody List<SecteurEntity> secteurs) {
        return this.secteurDao.addAllSecteurs(secteurs);
    }
    @PostMapping(path = "/updateSecteur")
    public SecteurEntity updateSecteur(@RequestBody SecteurEntity secteur){
        return this.secteurDao.AddSecteur(secteur);
    }
    @PostMapping(path = "/updateAllsec")
    public List<SecteurEntity> updateAllSecteurs(@RequestBody List<SecteurEntity> secteurs) {
        return this.secteurDao.addAllSecteurs(secteurs);
    }


    /*@GetMapping("/delete_commande")
    public String deletecom(@RequestParam Long id){
        this.commandeDao.deleteCommandeById(id);
        return "La commande a été supprimée";
    }*/
    @DeleteMapping("/delete_secteur")
    public ResponseEntity<String> deletesec(@RequestParam Long id) {
        secteurDao.deleteSecteurById(id);
        return ResponseEntity.ok("Le secteur a été supprimé");
    }


    @GetMapping("/deleteallsec")
    public List<SecteurEntity> deleteall()
    {
        return this.secteurDao.deleteAllSecteurs();
    }


    @GetMapping(path = "/getallsec")
    public List<SecteurEntity> getall()
    {
        return this.secteurDao.getAllSecteurs();
    }

    @GetMapping("/getSecteur")
    public SecteurEntity getsec(@RequestParam Long id){
        return this.secteurDao.getSecteurById(id);
    }
}
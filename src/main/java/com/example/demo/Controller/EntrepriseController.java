package com.example.demo.Controller;

import com.example.demo.DAO.EntrepriseDao;
import com.example.demo.entity.EntrepriseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(path = "/Entreprise")
@RestController
@CrossOrigin//("http://localhost:4200")
public class EntrepriseController {



    @Autowired
    private EntrepriseDao entrepriseDao;

    @PostMapping(path = "/addEntreprise")
    public EntrepriseEntity addEntreprise(@RequestBody EntrepriseEntity entreprise){
        return this.entrepriseDao.AddEntreprise(entreprise);
    }
    @PostMapping(path = "/addAll")
    public List<EntrepriseEntity> addAllEntreprises(@RequestBody List<EntrepriseEntity> entreprises) {
        return this.entrepriseDao.addAllEntreprises(entreprises);
    }
    @PostMapping(path = "/updateEntreprise")
    public EntrepriseEntity updateEntreprise(@RequestBody EntrepriseEntity entreprise){
        return this.entrepriseDao.AddEntreprise(entreprise);
    }

    @PostMapping(path = "/updateAll")
    public List<EntrepriseEntity> updateAllEntreprises(@RequestBody List<EntrepriseEntity> entreprises) {
        return this.entrepriseDao.addAllEntreprises(entreprises);
    }


    @DeleteMapping("/delete_Entreprise")
    public ResponseEntity<String> deleteEntreprise(@RequestParam Long id) {
        entrepriseDao.deleteEntrepriseById(id);
        return ResponseEntity.ok("L'entreprise a été supprimé");
    }


    @GetMapping("/deleteall")
    public List<EntrepriseEntity> deleteall()
    {
        return this.entrepriseDao.deleteAllEntreprises();
    }


    @GetMapping(path = "/getall")
    public List<EntrepriseEntity> getall()
    {
        return this.entrepriseDao.getAllEntreprises();
    }

    @GetMapping("/getEntreprise")
    public EntrepriseEntity getprod(@RequestParam Long id){
        return this.entrepriseDao.getEntrepriseById(id);
    }
}

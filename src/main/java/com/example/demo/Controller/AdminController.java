package com.example.demo.Controller;

import com.example.demo.DAO.AdminDao;
import com.example.demo.entity.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/Admin")
@RestController

public class AdminController {
    @Autowired
    private AdminDao adminDao;

    @GetMapping("/check")
    public AdminEntity checkadmins(@RequestParam String email, String password) {
        return this.adminDao.checkadmin(email, password);
    }

    @PostMapping("/login")
    public boolean login(@RequestParam String email, String password) {

        AdminEntity adminEntity = adminDao.checkadmin(email, password);
        System.out.println(adminEntity + "GG");
        if (adminEntity != null) {
            return true;
        } else {
            return false;
        }
    }


    @PostMapping(path = "/addAdmin")
    public AdminEntity addAdmin(@RequestBody AdminEntity admin) {
        return this.adminDao.AddAdmin(admin);
    }

}
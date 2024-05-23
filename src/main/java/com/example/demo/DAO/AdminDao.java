package com.example.demo.DAO;

import com.example.demo.entity.AdminEntity;
import com.example.demo.repository.AdminReposotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AdminDao {
    @Autowired
    private AdminReposotry adminReposotry ;

    public AdminEntity checkadmin(String email, String password){
        return adminReposotry.findOneByEmailAndPassword(email, password).orElse(null);
    }

    public AdminEntity AddAdmin (AdminEntity admin){
        return  this.adminReposotry.save(admin);
    }


}

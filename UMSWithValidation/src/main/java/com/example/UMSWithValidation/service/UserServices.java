package com.example.UMSWithValidation.service;

import com.example.UMSWithValidation.model.UserManagement;
import com.example.UMSWithValidation.repo.IUserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    IUserRepo iUserRepo;

    public String addUser(List<UserManagement> newUser){
        iUserRepo.saveAll(newUser);
        return "New User Added";
    }
    public List<UserManagement> getUserById(Integer id){
        return (List<UserManagement>) iUserRepo.findAllById(Collections.singleton(id));
    }
    public List<UserManagement> getUsers(){
        return (List<UserManagement>) iUserRepo.findAll();
    }
    public String updateUserInfo(Integer id, String name){
        UserManagement pUser = iUserRepo.findById(id).orElse(null);
        if(pUser != null){
            pUser.setUserName(name);
            iUserRepo.save(pUser);
            return "Info Updated";
        }
        else
            return "User Not Found";
    }

    public String deleteUser(Integer id){
        iUserRepo.deleteById(id);
        return "User Deleted";
    }
}

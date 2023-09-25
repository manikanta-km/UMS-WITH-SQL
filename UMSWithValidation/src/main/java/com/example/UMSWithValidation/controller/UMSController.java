package com.example.UMSWithValidation.controller;

import com.example.UMSWithValidation.model.UserManagement;
import com.example.UMSWithValidation.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UMSController{
    @Autowired
    UserServices userServices;

    @PostMapping("user")
    public String addUser(@RequestBody List<UserManagement> newUser){
        return userServices.addUser(newUser);
    }
    @GetMapping("userById/id/{id}")
    public List<UserManagement> getUserById(@PathVariable Integer id){
        return userServices.getUserById(id);
    }

    @GetMapping("users")
    public List<UserManagement> getUsers(){
        return userServices.getUsers();
    }

    @PutMapping("updateUserInfo/id/{id}/name")
    public String updateUserInfo(@PathVariable Integer id, @RequestParam String name){
        return userServices.updateUserInfo(id,name);
    }

    @DeleteMapping("user")
    public String deleteUser(@RequestParam Integer id){
        return userServices.deleteUser(id);
    }


}

package com.example.login.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.model.LoginModel;
import com.example.login.service.LoginService;
@RestController
@RequestMapping("/com")
public class LoginController {
    private LoginService LoginService;
    public LoginController( LoginService LoginService)
    {
        this.LoginService=LoginService;
    }
    
    @GetMapping("/customer")
    public List <LoginModel> display(){
        return LoginService.gModels();
    }

    @GetMapping("/customer/{id}")
    public LoginModel display(@PathVariable Integer id){
        return LoginService.get(id);
    }

    @PostMapping("/customer")
    public LoginModel create(@RequestBody LoginModel m)
    {
        return LoginService.create(m);

    }
    @PutMapping("/customer/{id}")
    public String update(@RequestBody LoginModel m,@PathVariable Integer id){
        return LoginService.update(m, id);
    }
    @DeleteMapping("/customer/{id}")
    public String delete(@PathVariable Integer id)
    {
        return LoginService.delete(id);
    }

}
package com.example.login.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.login.model.LoginModel;
//import com.example.login.model.LoginModel;
@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Integer>{
}
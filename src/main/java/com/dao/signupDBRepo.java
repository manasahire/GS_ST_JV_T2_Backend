package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.signUp;

public interface signupDBRepo extends JpaRepository<signUp, String> {

}

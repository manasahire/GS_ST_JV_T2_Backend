package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.empDBRepo;
import com.entity.empDB;
import com.entity.prmDB;

@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")
public class empController {
	
	@Autowired
	empDBRepo repo;
	
	@PostMapping("/empData")
	public ResponseEntity<Map<String, String>>prmData (@RequestBody empDB edb){
		Map<String, String> response = new HashMap<>();
		response.put("message","EMP Data added successfully");
		 repo.save(edb);
		return ResponseEntity.ok(response);
	
	}

}

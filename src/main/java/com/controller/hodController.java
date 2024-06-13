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

import com.dao.hodDBRepo;
import com.entity.hodDB;

@RestController
@RequestMapping("/hod")
@CrossOrigin("http://localhost:4200")
public class hodController {
	
	@Autowired
	hodDBRepo repo;
	
	@PostMapping("/hodData")
	public ResponseEntity<Map<String,String>>hodData (@RequestBody hodDB hdb){
		Map<String, String> response = new HashMap<>();
		response.put("message","HOD Data added successfully");
		 repo.save(hdb);
		return ResponseEntity.ok(response);
	}

}

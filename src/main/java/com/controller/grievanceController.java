package com.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.grievanceDBRepo;
import com.entity.grievanceDB;

@RestController
@RequestMapping("/grievance")
@CrossOrigin("http://localhost:4200")
public class grievanceController {
	
	@Autowired
	grievanceDBRepo repo;
	
	@PostMapping("/submitGrievance")
	public ResponseEntity<Map<String, String>> submitGrievance (@RequestBody grievanceDB gdb){
		Map<String, String> response = new HashMap<>();
		response.put("message","Grievance added successfully");
		 repo.save(gdb);
		return ResponseEntity.ok(response);
	}
}

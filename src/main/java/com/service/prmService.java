package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.prmDBRepo;
import com.entity.prmDB;

@Service
public class prmService {
	 @Autowired
	    private prmDBRepo repo;

	    public List<prmDB> getAllGrievances() {
	        return repo.findAll();
	    }

	    public prmDB getGrievanceById(String grievanceId) {
	        return repo.findById(grievanceId).orElse(null);
	    }

	    public prmDB updateGrievanceStatus(String grievanceId, String status) {
	    	prmDB grievance = repo.findById(grievanceId).orElse(null);
	        if (grievance != null) {
	            grievance.setStatus(status);
	            return repo.save(grievance);
	        }
	        return null;
	    }
}

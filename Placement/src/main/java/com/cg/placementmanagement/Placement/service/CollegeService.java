package com.cg.placementmanagement.Placement.service;
import org.springframework.stereotype.Service;

import com.cg.placementmanagement.Placement.model.College;
import com.cg.placementmanagement.Placement.repository.CollegeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class CollegeService {

	@Autowired
    private CollegeRepository repo;
	
	public List<College> listAll() {
        return repo.findAll();
    }
     
    public void save(College std) {
        repo.save(std);
    }
     
    public College get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
	
}

package com.cg.placementmanagement.Placement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.placementmanagement.Placement.model.College;


@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
	 
}

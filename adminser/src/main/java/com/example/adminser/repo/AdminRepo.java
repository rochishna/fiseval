package com.example.adminser.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.adminser.model.Admin;

@Repository
@Transactional
public interface AdminRepo extends JpaRepository<Admin,Integer> {
	

}

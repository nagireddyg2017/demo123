package com.bys.test.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bys.test.app.demo.model.UserInfo;

@Repository
@Component
public interface Demo123Repo extends JpaRepository<UserInfo, Long> 
{
	
	
}
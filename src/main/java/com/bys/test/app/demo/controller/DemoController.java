package com.bys.test.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bys.test.app.demo.model.UserInfo;
import com.bys.test.app.demo.repository.Demo123Repo;

@RestController
@RequestMapping(path = "/test")
public class DemoController {


    
    
	@Autowired(required = false)
    private UserInfo userInfo;
	@Autowired(required = false)
	private Demo123Repo demo123Repo;
   
    
	 
    
    @PostMapping(path="/")
    public UserInfo saveEmployee(@RequestBody UserInfo userInfo) 
    {
        
    	//demo123Repo.save(userInfo);
    	return userInfo;
    	
    }
    
    
    @GetMapping(path="/getDetails", produces = "application/json")
    public List<UserInfo> getDetails() 
    {
        
    	return demo123Repo.findAll();
    }
}

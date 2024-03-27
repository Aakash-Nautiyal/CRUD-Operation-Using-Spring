package com.google.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.demo.bean.Subject;
import com.google.demo.repo.Subject_Repo;

@Service
public class Subject_Service {
	
	@Autowired
	public Subject_Repo repo;
	public List<Subject>getAllSubjects(){
		
		List<Subject>sub=new ArrayList<>();
		repo.findAll().forEach(sub::add);
		return sub;
//		 List<Subject> sub = new ArrayList<>();
//		 Iterator<Subject> iterator = repo.findAll().iterator();
//		 
//		    while (iterator.hasNext()) {
//		        sub.add(iterator.next());
//		        
//		    }
//		    return sub;
	}
	
	
	public String addSubject(Subject subject) {
		repo.save(subject);
		return "Object has been added";
	}
	public String updateSubject(String id, Subject subject) {
		repo.save(subject);
		return "Object has been updated";
		
	}
	public String deleteSubject(String id) {
		repo.deleteById(id);
		return "Object has been deleted";
	}
	
	
}

package com.google.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.google.demo.bean.Subject;
import com.google.demo.service.Subject_Service;


@RestController
public class Controller {
	
	@Autowired
	Subject_Service subService;
	
	// @RequestMapping("/subjects")
	@GetMapping("/subjects") 
	public List<Subject>getAllSubjects(){
		
		return subService.getAllSubjects();
	}
	
	@PostMapping("/subjects")
	public String addSubject(@RequestBody Subject subject) {
		return subService.addSubject(subject);
	}
	
	
	@PutMapping("/subjects/{id}")
	public String updateSubject(@PathVariable String id, @RequestBody Subject subject) 
	{
		return subService.updateSubject(id,subject);
	}
	
	@DeleteMapping("/subjects/{id}")
	public String deleteSubject(@PathVariable String id) {
		return subService.deleteSubject(id);
	}
}








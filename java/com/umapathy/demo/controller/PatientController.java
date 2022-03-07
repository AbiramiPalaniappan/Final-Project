package com.umapathy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.model.Patient;
import com.umapathy.demo.serviceImpl.PatientServiceImpl;

@RestController
public class PatientController {
	
	@Autowired
	PatientServiceImpl patientServiceImpl;
	
	@PostMapping("/reg")
	public void register(@RequestBody Patient patient) {
		patientServiceImpl.register(patient);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Patient patient) {
		patientServiceImpl.update(patient);
	}
	
	@GetMapping("/view")
	public List<Patient> view(){
		return patientServiceImpl.view();
	}
	@DeleteMapping("/delete")
	public void delete(@RequestBody Patient patient) {
		patientServiceImpl.delete(patient);
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable int id) {
	patientServiceImpl.deleteByID(id);
	}	
	@GetMapping("/getById/{id}")
	public Patient getById(@PathVariable int id) {
		return patientServiceImpl.getById(id);
	}
	
}	
	
	
	
	



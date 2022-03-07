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

import com.umapathy.demo.model.DiagnosticCenter;
import com.umapathy.demo.serviceImpl.DiagnosticCenterServiceImpl;

@RestController
public class DiagnosticCenterController {
	
	@Autowired
	DiagnosticCenterServiceImpl diagnosticCenterServiceImpl;
	
	@GetMapping("/showCenters")
	public List<DiagnosticCenter> showCenters() {
		// TODO Auto-generated method stub
		return diagnosticCenterServiceImpl.showCenters();
	}
	@PostMapping("/addCenters")
	public void addCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		diagnosticCenterServiceImpl.addCenter(diagnosticCenter);
	}
	@PutMapping("/updateCenters")
	public void updateCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		diagnosticCenterServiceImpl.updateCenter(diagnosticCenter);
	}
	@DeleteMapping("/deleteCenters")
	public void removeCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		diagnosticCenterServiceImpl.removeCenter(diagnosticCenter);
	}
	
	
	@GetMapping("/getCenters/{id}")
	public void getCenter(@PathVariable long id) {
		// TODO Auto-generated method stub
		diagnosticCenterServiceImpl.getCenter(id);
	}
	@GetMapping("/getAppointment")
	public void getAppointments(@PathVariable long id) {
		// TODO Auto-generated method stub
		diagnosticCenterServiceImpl.getAppointments(id);
	}
	
	@GetMapping("/getCenters/{name}")
	public List<DiagnosticCenter> findByName(String name) {
		// TODO Auto-generated method stub
		return diagnosticCenterServiceImpl.findByName(name);
	}




}

package com.umapathy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.model.DiagnosticTest;
import com.umapathy.demo.serviceImpl.DiagnosticTestServiceImpl;

@RestController
public class DiagnosticTestController {

	@Autowired
	DiagnosticTestServiceImpl diagnosticTestServiceImpl;
	
	@GetMapping("/viewTest")
	public List<DiagnosticTest> viewtest() {
		// TODO Auto-generated method stub
		return diagnosticTestServiceImpl.viewtest();
	}

	@PostMapping("/addTest")
	public void addTest(@RequestBody DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		diagnosticTestServiceImpl.addTest(diagnosticTest);
	}
	@PutMapping("/upTest")
	public void updateTest(@RequestBody DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		diagnosticTestServiceImpl.updateTest(diagnosticTest);
	}
	@DeleteMapping("/deleteTest")
	public void deleteTest(@RequestBody DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		diagnosticTestServiceImpl.deleteTest(diagnosticTest);
	}
}

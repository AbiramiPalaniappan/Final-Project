package com.umapathy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.model.TestResult;
import com.umapathy.demo.serviceImpl.TestResultServiceImpl;

@RestController
public class TestResultController {
	
	@Autowired
	TestResultServiceImpl testResultServiceImpl;
	
	@GetMapping("/viewresult")
	public List<TestResult> viewresult() {
		// TODO Auto-generated method stub
		return testResultServiceImpl.viewresult();
		
	}
	@PostMapping("/addResult")
	public void addResult(@RequestBody TestResult testResult) {
		// TODO Auto-generated method stub
		testResultServiceImpl.addResult(testResult);
	}
	@PutMapping("/upresult")
	public void updateResult(@RequestBody TestResult testResult) {
		// TODO Auto-generated method stub
		testResultServiceImpl.updateResult(testResult);
	}
	@DeleteMapping("/deleteResult")
	public void removeResult(@RequestBody TestResult testResult) {
		// TODO Auto-generated method stub
		testResultServiceImpl.removeResult(testResult);
	}

}

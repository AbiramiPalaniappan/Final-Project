package com.umapathy.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.model.TestResult;
import com.umapathy.demo.repo.TestResultRepo;
import com.umapathy.demo.service.TestResultService;

@Service
public class TestResultServiceImpl implements TestResultService{
	
	@Autowired
	TestResultRepo testResultRepo;

	@Override
	public List<TestResult> viewresult() {
		// TODO Auto-generated method stub
		return testResultRepo.findAll();
	}

	@Override
	public void addResult(TestResult testResult) {
		// TODO Auto-generated method stub
		testResultRepo.save(testResult);
	}

	@Override
	public void updateResult(TestResult testResult) {
		// TODO Auto-generated method stub
		testResultRepo.save(testResult);
	}

	@Override
	public void removeResult(TestResult testResult) {
		// TODO Auto-generated method stub
		testResultRepo.delete(testResult);
	}

}

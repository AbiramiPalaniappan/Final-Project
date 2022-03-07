package com.umapathy.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.model.DiagnosticTest;
import com.umapathy.demo.repo.DiagnosticTestRepo;
import com.umapathy.demo.service.DiagnosticTestService;

@Service
public class DiagnosticTestServiceImpl  implements DiagnosticTestService{
	
	@Autowired
	DiagnosticTestRepo diagnosticTestRepo;

	@Override
	public void addTest(DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		diagnosticTestRepo.save(diagnosticTest);
	}

	@Override
	public void updateTest(DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		diagnosticTestRepo.save(diagnosticTest);
	}

	@Override
	public void deleteTest(DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		diagnosticTestRepo.delete(diagnosticTest);
	}

	@Override
	public List<DiagnosticTest> viewtest() {
		// TODO Auto-generated method stub
		return diagnosticTestRepo.findAll();
	}

}

package com.umapathy.demo.service;

import java.util.List;

import com.umapathy.demo.model.DiagnosticTest;

public interface DiagnosticTestService {
	
	public void addTest(DiagnosticTest diagnosticTest);
	public void updateTest(DiagnosticTest diagnosticTest);
	public void deleteTest(DiagnosticTest diagnosticTest);
	public List<DiagnosticTest>viewtest();

}

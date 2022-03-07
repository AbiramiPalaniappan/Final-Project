package com.umapathy.demo.service;

import java.util.List;

import com.umapathy.demo.model.DiagnosticCenter;

public interface DiagnosticCenterService {
	
	public List<DiagnosticCenter> showCenters();
	public void addCenter(DiagnosticCenter diagnosticCenter);
	public void updateCenter(DiagnosticCenter diagnosticCenter);
	public void removeCenter(DiagnosticCenter diagnosticCenter);
	
	public void getAppointments(long id);
	public void getCenter(long id);
	public List<DiagnosticCenter>findByName(String name);
}

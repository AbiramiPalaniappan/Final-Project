package com.umapathy.demo.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.model.DiagnosticCenter;
import com.umapathy.demo.repo.DiagnosticCenterRepo;
import com.umapathy.demo.service.DiagnosticCenterService;

@Service
public class DiagnosticCenterServiceImpl implements DiagnosticCenterService {

	@Autowired
	DiagnosticCenterRepo diagnosticCenterRepo;

	@Override
	public List<DiagnosticCenter> showCenters() {
		// TODO Auto-generated method stub
		return diagnosticCenterRepo.findAll();
	}

	@Override
	public void addCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		diagnosticCenterRepo.save(diagnosticCenter);
	}

	@Override
	public void getCenter(long id) {
		// TODO Auto-generated method stub
		diagnosticCenterRepo.findById(id);
	}

	@Override
	public void updateCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		diagnosticCenterRepo.save(diagnosticCenter);
	}

	

	@Override
	public void getAppointments(long id) {
		// TODO Auto-generated method stub
		diagnosticCenterRepo.getById(id);
	}

	@Override
	public List<DiagnosticCenter> findByName(String name) {
		// TODO Auto-generated method stub
		return diagnosticCenterRepo.findByName(name);
	}

	@Override
	public void removeCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		diagnosticCenterRepo.delete(diagnosticCenter);
	}

}

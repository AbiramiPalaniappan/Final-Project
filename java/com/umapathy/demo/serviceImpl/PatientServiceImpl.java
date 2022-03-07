package com.umapathy.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.model.Patient;
import com.umapathy.demo.repo.PatientRepo;
import com.umapathy.demo.service.PatientService;

@Service
public class PatientServiceImpl  implements PatientService{

	@Autowired
	PatientRepo patientRepo;
	
	@Override
	public void register(Patient patient) {
		// TODO Auto-generated method stub
		patientRepo.save(patient);
	}

	@Override
	public void update(Patient patient) {
		// TODO Auto-generated method stub
		patientRepo.save(patient);
	}

	@Override
	public List<Patient> view() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public void delete(Patient patient) {
		// TODO Auto-generated method stub
		patientRepo.delete(patient);
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(id);
		
	}

	@Override
	public Patient getById(int id) {
		// TODO Auto-generated method stub
		return patientRepo.findById(id).get();
	}
	
		
		
		
		
		
		
		
		
		
		
	}


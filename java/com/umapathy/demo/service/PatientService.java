package com.umapathy.demo.service;

import java.util.List;

import com.umapathy.demo.model.Patient;

public interface PatientService {
 
	public void register(Patient patient);
	public void update(Patient patient);
	public List<Patient> view();
	public void delete(Patient patient);
	public void deleteByID(int id);
	public Patient getById(int id);
}

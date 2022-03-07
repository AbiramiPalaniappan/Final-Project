package com.umapathy.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.model.Appointment;
import com.umapathy.demo.repo.AppointmentRepo;
import com.umapathy.demo.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepo appointmentRepo;
	
	@Override
	public void addAppoinment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentRepo.save(appointment);
	}

	@Override
	public List<Appointment> view() {
		// TODO Auto-generated method stub
		return appointmentRepo.findAll();
	}

	@Override
	public void updateAppoinment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentRepo.save(appointment);
	}

	@Override
	public List<Appointment> list() {
		// TODO Auto-generated method stub
		return appointmentRepo.findAll(); 
	}

	
	@Override
	public void deleteAppoinment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentRepo.delete(appointment);
	}

	/*@Override
	public Appointment getById(int id) {
		// TODO Auto-generated method stub
		return appointmentRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		appointmentRepo.deleteById(id);
	}
*/


	
	
	
	
	
	
	
}

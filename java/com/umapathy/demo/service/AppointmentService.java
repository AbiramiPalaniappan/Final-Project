package com.umapathy.demo.service;

import java.util.List;

import com.umapathy.demo.model.Appointment;

public interface AppointmentService {
	
	public void addAppoinment(Appointment appointment);
	public List<Appointment> view();
	public void updateAppoinment(Appointment appointment);
	public List<Appointment> list();
	public void deleteAppoinment(Appointment appointment);
	//public Appointment getById(int id);
	//public void deleteById(int id);

}

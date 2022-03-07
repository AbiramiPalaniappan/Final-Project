package com.umapathy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.model.Appointment;
import com.umapathy.demo.serviceImpl.AppointmentServiceImpl;

@RestController
public class AppointmentController {
	
	@Autowired
	AppointmentServiceImpl appointmentServiceImpl;
	
	@PostMapping("/addAp")
	public void addAppoinment(@RequestBody Appointment appointment) {
		appointmentServiceImpl.addAppoinment(appointment);
	}
	@GetMapping("/viewAp")
	public List<Appointment> view(){
		return appointmentServiceImpl.view();
	}
	@PutMapping("/updateAp")
	public void updateAppoinment(@RequestBody Appointment appointment) {
		appointmentServiceImpl.updateAppoinment(appointment);
	}
	@DeleteMapping("/deleteAp")
	public void deleteAppoinment(@RequestBody Appointment appointment) {
		appointmentServiceImpl.deleteAppoinment(appointment);
	}
	/*	@GetMapping("/getById/{id}")	
		public Appointment getById(@PathVariable int id) {
			// TODO Auto-generated method stub
			return appointmentServiceImpl.getById(id);
		}
		@DeleteMapping("/deleteById/{id}")
		public void deleteById(@PathVariable int id) {
			// TODO Auto-generated method stub
			appointmentServiceImpl.deleteById(id);
		}*/

		
	
	
	
	

}

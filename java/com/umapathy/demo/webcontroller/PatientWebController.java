package com.umapathy.demo.webcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.umapathy.demo.model.Appointment;
import com.umapathy.demo.model.Patient;
import com.umapathy.demo.serviceImpl.PatientServiceImpl;

@Controller
public class PatientWebController {
	@Autowired
	PatientServiceImpl patientServiceImpl;
	

	
//------------------------To view patient list-----------------------------------------------
	@GetMapping("/patientlist")
	public String  viwePatient(Model model) {
		model.addAttribute("key1",patientServiceImpl.view());
		return "patientlist";
	}
//------------------------To add patient list------------------------------------------------
	@RequestMapping("/addPatient")
	public String  addpatient(Model model) {
		Patient patient=new Patient();
		Appointment appointment=new Appointment();
		patient.addAppointment(appointment);
		model.addAttribute("key", patient);
		model.addAttribute("pass", appointment);
		return "addPatient";
	
	}
	@PostMapping("/savePatient")
	public String addPatient(@ModelAttribute("patient") Patient patient) {
        patientServiceImpl.register(patient);
		return "redirect:/patientlist";
	}

//------------------------To update patient list---------------------------------------------
	@RequestMapping("/updatePatient")
	public String  updatepatient(Model model) {
		Patient patient=new Patient();
		Appointment appoint=new Appointment();
		patient.addAppointment(appoint);
		model.addAttribute("key7", patient);
		model.addAttribute("appoint2", appoint);
		return "updatePatient";
	
	}
	@PostMapping("/vsavePatient")
	public String upPatient(@ModelAttribute("patient") Patient patient) {
        patientServiceImpl.register(patient);
		return "redirect:/patientlist";
	}
//------------------------To delete patient list---------------------------------------------
	@GetMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable Integer id) {
		patientServiceImpl.deleteByID(id);
		return "redirect:/listPatient";
	}


}




package com.umapathy.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Appointment {
	
	@Id
	private int id;
	private String date;
	private String time;
	private String status;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private DiagnosticCenter diagnosticCenter;

	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;


	@OneToMany(cascade = CascadeType.ALL)
	private List<DiagnosticTest> diagnoticTest;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}


	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public List<DiagnosticTest> getDiagnoticTest() {
		return diagnoticTest;
	}


	public void setDiagnoticTest(List<DiagnosticTest> diagnoticTest) {
		this.diagnoticTest = diagnoticTest;
	}


	@Override
	public String toString() {
		return "Appointment [id=" + id + ", date=" + date + ", time=" + time + ", status=" + status
				+ ", diagnosticCenter=" + diagnosticCenter + ", patient=" + patient + ", diagnoticTest=" + diagnoticTest
				+ "]";
	}


	public Appointment(int id, String date, String time, String status, DiagnosticCenter diagnosticCenter,
			Patient patient, List<DiagnosticTest> diagnoticTest) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.status = status;
		this.diagnosticCenter = diagnosticCenter;
		this.patient = patient;
		this.diagnoticTest = diagnoticTest;
	}


	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}



}

	
	
	


	



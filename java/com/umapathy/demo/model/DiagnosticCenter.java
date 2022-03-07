package com.umapathy.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class DiagnosticCenter {
	@Id
	private long  id;
	private String name;
	private long contactNo;
	private String address;
	private String email;
	private String serviceList;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticTest diagnosticTest;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticTest diagnosticTest;
	@OneToOne(cascade = CascadeType.ALL)
	private Appointment appointment;
	@ManyToMany
	@JoinTable(name = "DiagnosticCenter_DiagnosticTest", 
	joinColumns=
	@JoinColumn(name = "centerId"), 
	inverseJoinColumns = 
	@JoinColumn(name = "testId"))
	private List<DiagnosticTest> diagnosticTest;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getServiceList() {
		return serviceList;
	}
	public void setServiceList(String serviceList) {
		this.serviceList = serviceList;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public List<DiagnosticTest> getDiagnosticTest() {
		return diagnosticTest;
	}
	public void setDiagnosticTest(List<DiagnosticTest> diagnosticTest) {
		this.diagnosticTest = diagnosticTest;
	}
	@Override
	public String toString() {
		return "DiagnosticCenter [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", email=" + email + ", serviceList=" + serviceList + ", appointment=" + appointment
				+ ", diagnosticTest=" + diagnosticTest + "]";
	}
	public DiagnosticCenter(long id, String name, long contactNo, String address, String email, String serviceList,
			Appointment appointment, List<DiagnosticTest> diagnosticTest) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.email = email;
		this.serviceList = serviceList;
		this.appointment = appointment;
		this.diagnosticTest = diagnosticTest;
	}
	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	

}

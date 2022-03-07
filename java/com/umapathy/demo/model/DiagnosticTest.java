package com.umapathy.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class DiagnosticTest {
	@Id
	private int testId;
	private String testName;
	private double testPrice;
	private int unit;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Appointment appointment;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Appointment appointment;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<DiagnosticCenter> diagnosticCenter;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public double getTestPrice() {
		return testPrice;
	}

	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public List<DiagnosticCenter> getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(List<DiagnosticCenter> diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	@Override
	public String toString() {
		return "DiagnosticTest [testId=" + testId + ", testName=" + testName + ", testPrice=" + testPrice + ", unit="
				+ unit + ", appointment=" + appointment + ", diagnosticCenter=" + diagnosticCenter + "]";
	}

	public DiagnosticTest(int testId, String testName, double testPrice, int unit, Appointment appointment,
			List<DiagnosticCenter> diagnosticCenter) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testPrice = testPrice;
		this.unit = unit;
		this.appointment = appointment;
		this.diagnosticCenter = diagnosticCenter;
	}

	public DiagnosticTest() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticCenter diagnosticCenter;
//	@OneToOne(cascade = CascadeType.ALL)
//	private TestResult testResult;
	

}

package com.umapathy.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TestResult {
	@Id
	private int resultId;
	private double testReading;
	private String conditionStatus;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Appointment appointment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private  Appointment appointment;

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public double getTestReading() {
		return testReading;
	}

	public void setTestReading(double testReading) {
		this.testReading = testReading;
	}

	public String getConditionStatus() {
		return conditionStatus;
	}

	public void setConditionStatus(String conditionStatus) {
		this.conditionStatus = conditionStatus;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "TestResult [resultId=" + resultId + ", testReading=" + testReading + ", conditionStatus="
				+ conditionStatus + ", appointment=" + appointment + "]";
	}

	public TestResult(int resultId, double testReading, String conditionStatus, Appointment appointment) {
		super();
		this.resultId = resultId;
		this.testReading = testReading;
		this.conditionStatus = conditionStatus;
		this.appointment = appointment;
	}

	public TestResult() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

}

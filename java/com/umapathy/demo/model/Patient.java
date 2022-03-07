package com.umapathy.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int patientId;
	   	private String firstName;
	   	private String lastName;
	   	private int age;
	   	private String gender;
	   	private String phoneNumber;
	   	private String email;
	   	@OneToOne(cascade = CascadeType.ALL)
	   	private Appointment appointment;
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Appointment getAppointment() {
			return appointment;
		}
		public void setAppointment(Appointment appointment) {
			this.appointment = appointment;
		}
		@Override
		public String toString() {
			return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
					+ age + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", email=" + email
					+ ", appointment=" + appointment + "]";
		}
		public Patient(int patientId, String firstName, String lastName, int age, String gender, String phoneNumber,
				String email, Appointment appointment) {
			super();
			this.patientId = patientId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.gender = gender;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.appointment = appointment;
		}
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void addAppointment(Appointment appoint) {
			// TODO Auto-generated method stub
			
		}
	   	
	   	
		
	
	
}

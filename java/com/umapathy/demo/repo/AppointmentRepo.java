package com.umapathy.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.model.Appointment;
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}

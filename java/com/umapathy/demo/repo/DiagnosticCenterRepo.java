package com.umapathy.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.model.DiagnosticCenter;
@Repository
public interface DiagnosticCenterRepo extends JpaRepository<DiagnosticCenter, Long>{

	List<DiagnosticCenter> findByName(String name);

}

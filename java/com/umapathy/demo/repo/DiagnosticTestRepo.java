package com.umapathy.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.model.DiagnosticTest;

@Repository
public interface DiagnosticTestRepo extends JpaRepository<DiagnosticTest, Integer>{

}

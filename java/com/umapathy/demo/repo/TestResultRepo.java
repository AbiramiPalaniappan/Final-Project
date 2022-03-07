package com.umapathy.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.model.TestResult;

@Repository
public interface TestResultRepo extends JpaRepository<TestResult, Integer>{

}

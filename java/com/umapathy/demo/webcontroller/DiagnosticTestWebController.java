package com.umapathy.demo.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.umapathy.demo.serviceImpl.DiagnosticTestServiceImpl;

@Controller
public class DiagnosticTestWebController {
	@Autowired
	DiagnosticTestServiceImpl diagnosticTestServiceImpl;
	
	

	@GetMapping("/addTest")
	public String addTest(){
	return "addTest";
	}

	@GetMapping("/updateTest")
	public String updateTest(){
	return "updateTest";
	}
	@GetMapping("/diagTest")
	public String viewTest(Model model) {
		model.addAttribute("key1",diagnosticTestServiceImpl.viewtest());
		return "diagTest";
	}

}

package com.umapathy.demo.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.umapathy.demo.model.DiagnosticCenter;
import com.umapathy.demo.serviceImpl.DiagnosticCenterServiceImpl;

@Controller
public class DiagnosticCenterWebController {
	
	@Autowired
	DiagnosticCenterServiceImpl diagnosticCenterServiceImpl;
	
	//---------------------To view the list of centers-----------------------------------
		@GetMapping("/center")
		public String  viewcenter(Model model ) {
			model.addAttribute("key1",diagnosticCenterServiceImpl.showCenters());
			return "center";
		}
	
//---------------------------To add a centers----------------------------------------------------
//	@RequestMapping("/addCenter")
//	public String  addCenters(Model model) {
//		DiagnosticCenter center=new DiagnosticCenter();
//		model.addAttribute("key3", center);
//		return "addCenter";
//	
//	}
//	@PostMapping("/saveCenter")
//	public String addCenter(@ModelAttribute("center") DiagnosticCenter center) {
//        diagnosticCenterServiceImpl.addCenter(center);
//		return "redirect:/centerlist";
//	}

	

	@GetMapping("/addCenter") // load empty center form
	public String addc(Model model, DiagnosticCenter diagnosticCenter ) {
		try {
			model.addAttribute("addcenterkey", diagnosticCenter);
			return "addCenter";
		} catch (Exception e) {
			e.printStackTrace();
			return "something went Wrong";
		}
	}

	@PostMapping("/saveCenter") // save center
	public String saveCenter(Model model, DiagnosticCenter diagnosticCenter) {
		try {
			diagnosticCenterServiceImpl.addCenter(diagnosticCenter);
			return "redirect:/addCenter";
		} catch (Exception e) {
			e.printStackTrace();
			return "something wrong data enter";
		}
	}
	

	
	//---------------------To update the list of centers-----------------------------------
	@GetMapping("/updateCenter")
	public String updateCenter(){
	return "updateCenter";
	}
	
}

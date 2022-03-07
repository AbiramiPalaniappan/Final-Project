package com.umapathy.demo.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminWebController {
	
	
	@GetMapping("/index")
	public String index(){
	return "index";
	}
	
	@GetMapping("/signup")
	public String signup() {
	return "signup";
	}
	@GetMapping("/adminlogin")
	public String al() {
		return "adminlogin";
	}
	@GetMapping("/adminHome")
	public String adminhome(){
	return "adminHome";
	}
	@GetMapping("/approvallist")
	public String approvallist(){
	return "approvallist";
	}
	
	@GetMapping("/adminpanel")
	public String  adminpanel() {
		return "adminpanel";
	}
	@GetMapping("/approval")
	public String  approval() {
		return "approval";
	}

}

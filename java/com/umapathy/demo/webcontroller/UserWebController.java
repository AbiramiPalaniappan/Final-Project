package com.umapathy.demo.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserWebController {
	

	@GetMapping("/login")
	public String log() {
	return "login";
	}
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/track")
	public String track() {
		return "track";
	}
	
	@GetMapping("/appointment")
	public String appointment() {
		return "appointment";
	}
	

}

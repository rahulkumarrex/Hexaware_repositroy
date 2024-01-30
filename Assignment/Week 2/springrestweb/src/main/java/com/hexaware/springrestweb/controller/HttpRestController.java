package com.hexaware.springrestweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HttpRestController {
	
	@GetMapping("/get")
	public String getData() {
		return "data get";
	}
	
	@PostMapping("/add")
	public String addData() {
		
		return "data added";
	}

}

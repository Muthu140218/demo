package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker1")
public class SpringBootDockerController {
	
	@GetMapping
	public String index() {
		return "Spring Boot Docker Example";
	}
}

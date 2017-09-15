package com.naresh.dockerdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {

	@GetMapping
	public String index() {
		System.out.println("UserController");
		return "Welcome";
	}
}

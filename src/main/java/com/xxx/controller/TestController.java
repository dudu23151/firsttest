package com.xxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String aaa(){
		return this.restTemplate.getForObject("http://localhost:8090/",String.class);
	}
	
}

package com.examp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping(value = {"/hi","/hello"},method=RequestMethod.GET)
	public String say() {
		return "hello world";
	}
}

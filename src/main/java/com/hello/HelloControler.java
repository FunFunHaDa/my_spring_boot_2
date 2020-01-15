package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	@GetMapping("/hellow")
	
	public String good()
	{
		return "Hello World";
	}
}

package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	@GetMapping("/helloWorld")
	public String good() // 메서드 이름 상관없음
	{
		return "welcome.html";
	}
}

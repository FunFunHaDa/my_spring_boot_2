package com.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/hello7")
	public String good() // 메서드 이름 상관없음
	{
		return "welcome";
	}
}
	


	





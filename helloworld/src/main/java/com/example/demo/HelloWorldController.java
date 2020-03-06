package com.example.demo;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@RequestMapping("/helloworld")
	public String helloMethod() {
		
		//new comment in local
		return "Hello to sts project";
	}
}

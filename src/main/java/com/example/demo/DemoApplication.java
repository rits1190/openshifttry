package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {


	@GetMapping("/")
	public String welcome() {
		return "Hello RitikaUserTry";
	}
	
	@GetMapping("/{input}")
	public String functry(@PathVariable String input)
	{
		return "Hi "+input+ " It is success";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

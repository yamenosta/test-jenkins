package com.example.demo2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	@GetMapping("/test")
	public Map<String, String> test() {
		Map<String, String> data = new HashMap<String, String>();
		data.put("name", "yamen");
		data.put("age", "32");
		return data;
	}


}

package com.example.dockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAppApplication {

	@GetMapping("/hi")
	public String test() {
		return "Hi";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerAppApplication.class, args);
	}

}

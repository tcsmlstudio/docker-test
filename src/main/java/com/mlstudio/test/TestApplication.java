package com.mlstudio.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class TestApplication {

     @GetMapping(path="/test")
	 public String hello()
	 {
		 return "Hello,this app running in docker";
	 }
   
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}

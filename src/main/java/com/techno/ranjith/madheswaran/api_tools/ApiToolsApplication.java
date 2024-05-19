package com.techno.ranjith.madheswaran.api_tools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@SpringBootApplication
public class ApiToolsApplication {

@GetMapping(path="/test")
public static void testMethod(){
	System.out.println("ApiToolsApplication.main()");
}
	public static void main(String[] args) {
		SpringApplication.run(ApiToolsApplication.class, args);
		System.out.println("ApiToolsApplication.main()");
	}

}

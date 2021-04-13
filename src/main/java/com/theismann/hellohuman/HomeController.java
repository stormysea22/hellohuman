package com.theismann.hellohuman;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="fname", required=false) String fname, @RequestParam(value="lname", required=false) String lname) {
		if(fname != null && lname == null) {
			return "<h1>Hello" + fname + "</h1>" + "<\n" + "<h3> Welcome to Spring Boot!</h3>";
		}
		if (fname != null && lname != null) {
			return "<h1>Hello" + fname + " " + lname + "</h1>" + "<\n" + "<h3> Welcome to Spring Boot!</h3>";
		}
		else {
			return "<h1>Hello Human</h1>" + "<h3>Welcome to Spring Boot</h3>";
		}
	}
}

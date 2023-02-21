
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rolex {
	String platform="Iam neo";
	@RequestMapping("/hi")
	public String getname() {
		return "Welcome to " + platform;
	}

}
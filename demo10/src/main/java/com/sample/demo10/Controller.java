package com.sample.demo10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/stringbyoperator")
	private int strcheck() {
		String s1="hi";
		String s2="hi";
		if(s1==s2) {
			return 1;
		}
		return 0;
	}
	@GetMapping("/stringbymethod")
	private int strcheck2() {
		String s1="hi";
		String s2="hi";
		if(s1.equals(s2)) {
			return 1;
		}
		return 0;
	}
	
}

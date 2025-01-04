package com.Jenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Jenkins")
public class JenkinsController {

	@GetMapping(value="/get3")
	public String get() {
		return "Hi Suganyafgf";
	}
}

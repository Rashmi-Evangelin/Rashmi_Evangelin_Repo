package com.sampledevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDevopsController {
	@GetMapping("/get")
	public String getDetails() {
		return "Hello Evangelin Devops";
	}

}

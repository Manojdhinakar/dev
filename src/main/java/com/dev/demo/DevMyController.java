package com.dev.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevMyController {
	
	@GetMapping("/myget")
	public String getmy() {
		return "First getings";
	}
	@GetMapping("/mygets")
	public String getmys() {
		return "Second getings";
	}

}

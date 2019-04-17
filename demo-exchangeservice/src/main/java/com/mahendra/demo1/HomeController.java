package com.mahendra.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  // Inject property USD into current variable
	@Value("${YEN}")
	private String rupeesToUsd;
	
	@GetMapping("/")
	public String rate() {
		return rupeesToUsd;
	}
}

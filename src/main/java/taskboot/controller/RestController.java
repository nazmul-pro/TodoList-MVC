package taskboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/old")
	public String hello(){
		return "Bismillah";
	}

}

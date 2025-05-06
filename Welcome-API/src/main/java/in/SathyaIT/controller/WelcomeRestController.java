package in.SathyaIT.controller;

import java.security.PublicKey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/welcome")
public String getWelcomeMessage() {
	String message="Welcome to java classes by chandu......!";
	return message;
	
}
}

package in.SathyaIT.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@Autowired
	private Environment env;
	@GetMapping("/welcome")
public String getWelcomeMessage() {
		String port=env.getProperty("server.port");
	String message="Welcome to java classes by chandu......!("+port+")";
	return message;
	
}
}

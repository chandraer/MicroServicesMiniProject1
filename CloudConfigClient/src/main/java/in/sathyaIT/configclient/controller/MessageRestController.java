package in.sathyaIT.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope// to reload the properties dynamically
public class MessageRestController {
	@Value("${msg}")
private String msg;
	@GetMapping("/")
	public String getMsg() {
		return msg;
	}
}

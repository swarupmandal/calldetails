package com.ms.cd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigDetailsController {

	@Value("${my.greeting}")
	private String greetingMessage;

	@Value("${db.url}")
	private String dbURL;
	
	@Value("${my.greeting.cd}")
	private String greetingMessageCD;

	@Value("${db.url.cd}")
	private String dbURLCD;
	
	@Value("${my.greeting.cd.dev}")
	private String greetingMessageCDDEV;

	@Value("${db.url.cd.dev}")
	private String dbURLCDDEV;

	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@Value("${spring.datasource.username}")
	private String dbUser;
	
	@Value("${spring.datasource.password}")
	private String dbPassword;	
	
	
	@GetMapping(value = "/greeting", produces = MediaType.TEXT_PLAIN_VALUE)
	public String geeting() {
		return greetingMessage +" - " + dbURL;
	}
	
	@GetMapping(value = "/greeting-cd", produces = MediaType.TEXT_PLAIN_VALUE)
	public String geetingCD() {
		return greetingMessageCD +" - " + dbURLCD;
	}
	
	@GetMapping(value = "/greeting-cd-dev", produces = MediaType.TEXT_PLAIN_VALUE)
	public String geetingCDDEV() {
		return greetingMessageCDDEV +" - " + dbURLCDDEV;
	}
	
	@GetMapping(value = "/cd-details", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getdbDeatils() {
		return dbUrl +" - " + dbUser + " - " + dbPassword;
	}
}

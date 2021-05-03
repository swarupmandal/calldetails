package com.ms.cd.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.cd.dto.CallDetailsDto;
import com.ms.cd.service.CallDetailsService;

@RestController
@CrossOrigin
public class CallDetailsController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CallDetailsService callDetailsService;
	
	@GetMapping(value = "/customer/{phonrNo}/calldetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CallDetailsDto> getCustomerCallDetails(@PathVariable long phoneNo){
		
		logger.info("CallDetails request for customer ",phoneNo);
		return  callDetailsService.getCustomerCallDetails(phoneNo);		
	}	
}

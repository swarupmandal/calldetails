package com.ms.cd.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.cd.dto.CallDetailsDto;
import com.ms.cd.entity.CallDetails;
import com.ms.cd.repository.CallDetailsRepository;

@Service
public class CallDetailsService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CallDetailsRepository callDetailsRepository;
	
	public List<CallDetailsDto> getCustomerCallDetails(long phoneNo){
		
		logger.info("Calldetails request for customer ", + phoneNo);
		
		List<CallDetails> callDetails = callDetailsRepository.findByCalledBy(phoneNo);
		List<CallDetailsDto> callsDto = new ArrayList<>();
		for(CallDetails cd: callDetails) {
			callsDto.add(CallDetailsDto.valueOf(cd));
		}
		
		logger.info("Calldetails request for customer ", callDetails);
		
		return callsDto;
	}
	
}

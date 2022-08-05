package com.java.microservices.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

	@GetMapping("/sample-api")
	public String sampleApi() {
		logger.info("Sample api call received");
		return "sample-api";
	}

	public String hardcodedResponse(Exception ex) {
		return "fallback-response";
	}

}

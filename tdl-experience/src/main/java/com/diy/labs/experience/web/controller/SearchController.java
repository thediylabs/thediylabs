package com.diy.labs.experience.web.controller;


import java.awt.List;
import java.util.ArrayList;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diy.labs.experience.model.SearchRequestSchema;
import com.diy.labs.experience.model.SearchResponseSchema;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SearchController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);
	
	private static final String VERSION = "version";
	private static final String STATUS = "status";
	private static final String OK = "OK";
	
	// TODO: Change to POST for search implementation 
	@GetMapping("/api/category")
	public ResponseEntity<SearchResponseSchema> searchCategory(@RequestParam String tags) {
		LOGGER.info("Call initiated");
		
//		SearchResponseSchema response = SearchResponseSchema.builder().build();
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
}

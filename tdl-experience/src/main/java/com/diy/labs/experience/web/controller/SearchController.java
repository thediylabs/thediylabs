package com.diy.labs.experience.web.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diy.labs.experience.db.repository.ProductsRepository;
import com.diy.labs.experience.model.SearchRequestSchema;
import com.diy.labs.experience.model.SearchResponseSchema;
import com.diy.labs.model.hub.Product;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SearchController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);
	
	private static final String VERSION = "version";
	private static final String STATUS = "status";
	private static final String OK = "OK";
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@RequestMapping("/api/getCategory")
	public ResponseEntity<SearchResponseSchema> searchCategory(@RequestParam String tags) {
		// Inject fake data
		productsRepository.deleteAll();
		
		productsRepository.save(new Product(1,"Super Amazing Awesome Cake", "This cake is super duper amazing", "Gordon Ramsay", 12350, 25, Arrays.asList(new String[] {"cake", "sweet"}) , "A", "https://images.immediate.co.uk/production/volatile/sites/2/2019/04/Choc-Fudge-Cake-b2d1909.jpg?quality=45&resize=620,413"));
		productsRepository.save(new Product(2, "Not So Amazing Cake", "This cake is not so amazing", "Gordon Ramsay", 1234, 25, Arrays.asList(new String[] {"cake", "bitter"}), "U", "https://7yearolds.com/wp-content/uploads/2018/11/cake.jpgZ"));
		LOGGER.info("Products populated");

		List<Product> temp = new ArrayList<Product>();
		
		for (Product product : productsRepository.findByTags(tags)) {
			temp.add(product);
		}
		
		SearchResponseSchema response = SearchResponseSchema.builder().products(temp).build();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}

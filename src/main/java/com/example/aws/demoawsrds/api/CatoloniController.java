package com.example.aws.demoawsrds.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.aws.demoawsrds.model.Brazoloni;
import com.example.aws.demoawsrds.services.BrazoloniService;;

@RestController
public class CatoloniController {

	@Autowired
	private BrazoloniService brazoloniService;

	@GetMapping("/brazoloni/{id}")
	public Brazoloni getById(@PathVariable("id") Long id) {	
		return brazoloniService.getById(id);
	}
}

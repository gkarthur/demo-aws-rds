package com.example.aws.demoawsrds.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.aws.demoawsrds.model.Brazoloni;

@Component
public class BrazoloniService {

	private static List<Brazoloni> brazolonis = new ArrayList<>();
	
	//Initialize Data
	static {
		brazolonis.add(new Brazoloni(100L, "brazoloni01"));
		brazolonis.add(new Brazoloni(102L, "brazoloni02"));
		brazolonis.add(new Brazoloni(103L, "brazoloni03"));
	}
	
	public List<Brazoloni> getAll() {
		return brazolonis;
	}
	
	public Brazoloni getById(long id) {
		return new Brazoloni(id, "brazoloni01");
	}
}

package com.nirmaan.quizapplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.quizapplication.entity.Laptop;
import com.nirmaan.quizapplication.repository.LaptopRepository;
@Service


public class LaptopService {
	@Autowired
	public LaptopRepository lp;
	
	public Laptop create(Laptop lap) {
		return lp.save(lap);
	}
	public Laptop get(int lid) {
		return lp.findById(lid).get();
		
	}
    
}

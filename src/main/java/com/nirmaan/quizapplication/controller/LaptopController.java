package com.nirmaan.quizapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.quizapplication.entity.Laptop;
import com.nirmaan.quizapplication.service.LaptopService;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	@Autowired
	public LaptopService ls;
	
	@PostMapping("create")
	public Laptop lap(Laptop l) {
		return ls.create(l);
	}
	@GetMapping("get/{lid}")
	public Laptop lap1(@PathVariable int lid) {
		return ls.get(lid);
	}

}

package com.test.masiv.Masivtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping(value="/create/roulette")
	public String Msg1(){
		
		return "Servio";
	}
	@PostMapping(value="/open/roulette")
	public String Msg2(){
		
		return "Servio";
	}
	/*
	@PostMapping(value="/open/roulette")
	public String Ms3(){
		
		return "Servio";
	}
	@PostMapping(value="/open/roulette")
	public String Ms4(){
		
		return "Servio";
	}
	@PostMapping(value="/open/roulette")
	public String Msg(){
		
		return "Servio";
	}*/
}

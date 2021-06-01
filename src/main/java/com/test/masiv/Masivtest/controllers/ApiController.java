package com.test.masiv.Masivtest.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.masiv.Masivtest.models.Roulette;
import com.test.masiv.Masivtest.services.IRouletteService;
import com.test.masiv.Masivtest.services.IUserService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private IRouletteService RouletteService;
	@Autowired
	private IUserService UserService;
	
	@GetMapping(value="/create/roulette")
	public String Point1(){
		
		return RouletteService.AddRoulette();
	}
	
	@GetMapping(value="/open/roulette")
	public String Point2(@PathParam("Id") long Id){
		
		return RouletteService.Status(Id);
	}
	
	
	@PostMapping(value="/bet")
	public String Point3(@PathParam("Id") long Id ,@PathParam("Number") int Number){
		
		return UserService.BetUser(Id, Number);
	}
	@GetMapping(value="/bet/list")
	public String Point5(){
		
		return RouletteService.List();
	}
	/*
	@PostMapping(value="/open/roulette")
	public String Ms4(){
		
		return "Servio";
	}
	@PostMapping(value="/open/roulette")
	public String Msg(){
		
		return "Servio";
	}*/
}

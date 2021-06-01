package com.test.masiv.Masivtest.services;

import com.test.masiv.Masivtest.models.Roulette;
import com.test.masiv.Masivtest.models.enums.Status;
import com.test.masiv.Masivtest.repositorys.RouletteRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import java.util.List;
@Service
public class RouletteService implements IRouletteService {
	String Json =null;
	String Json2 =null;
	@Autowired
	private RouletteRepositoryJPA RouletteRepo;
	
	//the logic of the business is carried out in this part for security reasons and not in the controller as is usually done.
	@Override
	public String AddRoulette() {
		try {
			Roulette roulette = new Roulette();
			roulette.setStatus(Status.OPEN);
			RouletteRepo.save(roulette);
			Json = new Gson().toJson("Nueva ruleta creada con id:"+ "" +roulette.getId());
			
			return "["+Json+"]";
		} catch (Exception e) {
			Json = new Gson().toJson("Sucedio algún error ! \n");
			e.printStackTrace();
			
			return "["+Json+"]";
		
		}
		
	}
	@Override
	public String Status(Long id) {
		try {
			Roulette roulette = RouletteRepo.findByid(id);
			if(roulette.getStatus() == Status.OPEN){
				Json2 = new Gson().toJson("Operación exitosa!");
				Json = new Gson().toJson(roulette);
				
				return "["+Json2+Json+"]";	
			}else{
				Json2 = new Gson().toJson("Operación denegada!");
				Json = new Gson().toJson(roulette);
				
				return "["+Json2+Json+"]";
			}
		} catch (Exception e) {
			Json = new Gson().toJson("Sucedio algún error ! \n");
			e.printStackTrace();
			
			return "["+Json+"]";
		
		}
		
	}
	@Override
	public String List() {
		try {
			List<Roulette> list =RouletteRepo.findAll();
			Json2 = new Gson().toJson("Operación exitosa!");
			Json = new Gson().toJson(list);
			
			return "["+Json2+Json+"]";
		} catch (Exception e) {
			Json = new Gson().toJson("Sucedio algún error ! \n");
			e.printStackTrace();
			
			return "["+Json+"]";
		}
		
	}

}

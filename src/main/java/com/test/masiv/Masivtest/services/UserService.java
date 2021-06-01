package com.test.masiv.Masivtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.test.masiv.Masivtest.models.Bet;
import com.test.masiv.Masivtest.models.User;
import com.test.masiv.Masivtest.repositorys.BetRepositoryJPA;
import com.test.masiv.Masivtest.repositorys.UserRepositoryJPA;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepositoryJPA UserRepo;
	@Autowired
	private BetRepositoryJPA BetRepo;
	
	String Json = null;
	String Json2 = null;
	
	@Override
	public String BetUser(Long id, int number) {
		try {
			User user =UserRepo.findByid(id);
			if(user != null && user.getCredits() >0 ){
				if(number >0 && number <=36){
				user.setCredits(user.getCredits()-1);
				Bet bet = new Bet();
				bet.setNumber(number);
				BetRepo.save(bet);
				Json2 = new Gson().toJson("Se ha realizado apuesto te quedan !" + user.getCredits());
				Json = new Gson().toJson(user);
				
				return "["+Json2+Json+"]";	
				}else{
					Json = new Gson().toJson("Numero no valido para apostar, rango entre 0 y 36");
					
					return "["+Json+"]";
				}
			}else{
				Json = new Gson().toJson("El usuario no existe..!");
				
				return "["+Json+"]";	
			}
		} catch (Exception e) {
			
		}
		return null;
	}


}

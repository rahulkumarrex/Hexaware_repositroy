package com.hexaware.playermanagement.service;

import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.playermanagement.entity.Player;
import com.hexaware.playermanagement.exception.InvalidRoleException;
import com.hexaware.playermanagement.exception.PlayerNotFound;
import com.hexaware.playermanagement.repository.PlayerRepository;

@Service
public class PlayerService implements IPlayerService {
	
	@Autowired
	PlayerRepository repo;

	@Override
	public Player addNewPlayer(Player player) {
		return repo.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Player> getPlayerById(int pid) {
		
		return repo.findById(pid);
	}

	@Override
	public List<Player> getPlayerByRole(String role) throws InvalidRoleException{
		 if(isValidRole(role)) {
			 
	        	return repo.findByRole(role);
	        }
	        else throw new InvalidRoleException("Invalid role entered : " + role + " Please enter a valid role");
	}
	
	
	 private boolean isValidRole(String role) {
		    return "Batsman".equals(role) || "Bowler".equals(role) || "Keeper".equals(role) || "All Rounder".equals(role);
		}

	 
	@Override
	public List<Player> getPlayerByName(String name) throws PlayerNotFound  {
		List<Player> player = repo.findByName(name);
		
		if(player != null) {
			return repo.findByName(name);
		}
		else throw new PlayerNotFound("Player Not Found");
	}






	

}

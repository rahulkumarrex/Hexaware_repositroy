package com.hexaware.playermanagement.controller;

import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;
import com.hexaware.playermanagement.entity.Player;
import com.hexaware.playermanagement.exception.InvalidRoleException;
import com.hexaware.playermanagement.exception.PlayerNotFound;
import com.hexaware.playermanagement.service.IPlayerService;

import ch.qos.logback.classic.Logger;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api/players")
public class PlayerController {



	@Autowired
	IPlayerService service;
	
	@PostMapping("/add")
	public Player addNewPlayer(@RequestBody Player player) {
		
		return service.addNewPlayer(player);
		
	}
	@GetMapping("/getall")
	public List<Player> getAllPlayers(){
		
		return service.getAllPlayers();
	}
	

	@GetMapping("/get/{role}")
	public List<Player> getPlayerByRole(@PathVariable String role) throws InvalidRoleException  {
		
		return service.getPlayerByRole(role);
	}
	
	@GetMapping("/getname/{name}")
	public List<Player> getPlayerByName(@PathVariable String name) throws  PlayerNotFound{
		
		return service.getPlayerByName(name);

	}
}

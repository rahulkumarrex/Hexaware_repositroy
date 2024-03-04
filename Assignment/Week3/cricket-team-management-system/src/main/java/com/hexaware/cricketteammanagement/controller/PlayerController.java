package com.hexaware.cricketteammanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.entityservice.IPlayerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	IPlayerService service;
	
	@GetMapping("/getall")
	public List<Player> getAllPlayers(){
		return service.getAllPlayer();
	}

	@PostMapping("/add")
	public Player addPlayer(@RequestBody Player player ) {
		
		return service.addNewPlayers(player);
	}
		
	
}

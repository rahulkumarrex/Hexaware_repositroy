package com.hexaware.cricketteammanagement.entityservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.repository.PlayerRepository;


@Service
public class PlayerService implements IPlayerService {

	@Autowired
	PlayerRepository repo;
	
	@Override
	public List<Player> getAllPlayer() {
		return repo.findAll();
	}

	
	@Override
	public Player addNewPlayers(Player player) {
		return repo.save(player);
	}

	
	


	
}
	
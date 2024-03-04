package com.hexaware.cricketteammanagement.entityservice;

import java.util.List;

import com.hexaware.cricketteammanagement.entity.Player;

public interface IPlayerService {

	public List<Player> getAllPlayer();

	public Player addNewPlayers(Player player);
	


}

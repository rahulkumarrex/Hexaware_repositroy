package com.hexaware.playermanagement.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.playermanagement.entity.Player;
import com.hexaware.playermanagement.exception.InvalidRoleException;
import com.hexaware.playermanagement.exception.PlayerNotFound;

public interface IPlayerService {

	public Player addNewPlayer(Player player);
	public List<Player> getAllPlayers();
	public Optional<Player> getPlayerById(int pid);
	
	
	public List<Player> getPlayerByRole(String role) throws InvalidRoleException;
	public List<Player> getPlayerByName(String name) throws PlayerNotFound;
	
}

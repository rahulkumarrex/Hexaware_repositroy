package com.hexaware.playermanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.playermanagement.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{



	@Query("Select p from Player p Where p.playerName = :name")
	public List<Player> findByName(String name);
	
	@Query("Select p from Player p where p.role = :role ")
	public List<Player> findByRole(String role);
	
}

package com.example.LucaSteam2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.User;

@Repository
public interface GameDao extends JpaRepository<Game, Integer>{
	
	List<Game> findByUsername(String name);
	
	// La Query anterior sería
	// @Query("FROM Games WHERE name =?1")
	@Query("FROM Game WHERE name =?1")
	List<Game> searchAndFindByName(String name);
}

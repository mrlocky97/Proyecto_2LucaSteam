package com.example.LucaSteam2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.LucaSteam2.model.Game;

@Repository
public interface GameDao extends JpaRepository<Game, Integer> {

	List <Game> findByPublisher(String namePublisher);
	
	List <Game> findByGenre(String genre);
	
	List <Game> findByYear(String year);
}

package com.example.LucaSteam2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.LucaSteam2.model.Game;

@Repository
public interface GameDao extends JpaRepository<Game, Integer> {

	List <Game> findFirst50ByPublisher(String namePublisher);
	
	List <Game> findFirst50ByGenre(String genre);
	
	List <Game> findFirst50ByYear(String year);
	
	List <Game> findByIdBetween(int n,int n2);
}

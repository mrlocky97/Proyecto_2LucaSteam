package com.example.LucaSteam2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.LucaSteam2.model.Game;
import com.example.LucaSteam2.repository.GameDao;

public class GameServiceImpl {
	
	@Autowired
	GameDao gameDAO;
	
	@Override
	public void save(Game game) {
		gameDAO.save(game);	
	}
}

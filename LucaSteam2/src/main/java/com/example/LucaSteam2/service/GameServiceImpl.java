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

	// Encontar juego por id
	@Override
	public Optional<Game> findById(int id) {

		return gameDao.findById(id);
	}

	// Encontrar todos los juegos
	@Override
	public List<Game> findAll() {
		return gameDao.findAll();
	};

	// Eliminar por id

	public void deleteById(int id) {
		gameDao.deleteById(id);
	}
}

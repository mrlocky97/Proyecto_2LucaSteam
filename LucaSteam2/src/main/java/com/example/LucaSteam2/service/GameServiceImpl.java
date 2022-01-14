package com.example.LucaSteam2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LucaSteam2.model.Game;
import com.example.LucaSteam2.repository.GameDao;
@Service
public class GameServiceImpl implements GameService{

	@Autowired
	GameDao gameDAO;

	@Override
	public void save(Game game) {
		gameDAO.save(game);
	}

	// Encontar juego por id
	@Override
	public Optional<Game> findById(int id) {

		return gameDAO.findById(id);
	}

	// Encontrar todos los juegos
	@Override
	public List<Game> findAll() {
		return gameDAO.findAll();
	};

	// Eliminar por id

	public void deleteById(int id) {
		gameDAO.deleteById(id);
	}
}

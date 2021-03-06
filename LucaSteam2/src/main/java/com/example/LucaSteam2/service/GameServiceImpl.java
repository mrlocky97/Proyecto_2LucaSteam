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
		return gameDAO.findByIdBetween(1, 50);
	};

	// Eliminar por id

	public void deleteById(int id) {
		gameDAO.deleteById(id);
	}
	
	//Encontrar juegos por año
	@Override
	public List<Game> yearList(String year) {
		
		return gameDAO.findFirst50ByYear(year);
	}

	//Encontrar juegos por género
	@Override
	public List<Game> listByGenre(String genre) {
		
		return gameDAO.findFirst50ByGenre(genre);
	}

	@Override
	public List<Game> findAllNintendo() {
		// TODO Auto-generated method stub
		return gameDAO.findFirst50ByPublisher("Nintendo");
	}

}

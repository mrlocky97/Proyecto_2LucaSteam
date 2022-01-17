package com.example.LucaSteam2.service;

import java.util.List;
import java.util.Optional;

import com.example.LucaSteam2.model.Game;

public interface GameService {
	
	//Encontrar Game por id
	public Optional<Game> findById(int id);

	//Listar todos los juegos

	public List<Game> findAll();

	//Eliminar juego por id

	public void deleteById(int id);
	
	// for update and delete
	public void save(Game game);
	
	//lista todos los juegos de nintendo
	public List<Game> findAllNintendo();

	//Encontrar Game por año
	
	public List<Game> yearList(String year);
	
	//Encontrar Game por género
	
	public List<Game> listByGenre(String genre);
}

package com.example.LucaSteam2.controller;

import org.springframework.web.bind.annotation.PostMapping;


public class GameController {
	
	   //Guardar Usuario
	   @PostMapping("/save")
	   public String saveGame(Game game) {
		    service.save(game);
			return ("redirect:/");
		}
}

package com.example.LucaSteam2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.LucaSteam2.model.Game;

@Controller
public class GameController {
		
	   //Guardar Juego
	   @PostMapping("/save")
	   public String saveGame(Game game) {
		    service.save(game);
			return ("redirect:/");
		}
	   
	   //Dar de alta un juego Nuevo
	   @GetMapping("/newGame")
	   public String addNewGame(Game game, Model model) {
		   model.addAttribute("game", game);
		   return "GameForm";
	   }
}

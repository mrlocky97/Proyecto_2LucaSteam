package com.example.LucaSteam2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LucaSteam2.model.Game;
import com.example.LucaSteam2.service.GameService;

@Controller
public class GameController {
	@Autowired
	GameService service;
		
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
	   
	// Editar juego
		@GetMapping("/edit")
		public String editGame(@RequestParam("id") int id, Model m) {
			// Cuidado porque puede ser nulo. Debo decidir que hacer
			m.addAttribute("game", service.findById(id));
			return "GameForm";
		}

		// Listar juegos
		@GetMapping("/")
		public String listGames(Model m) {
			m.addAttribute("gameList", service.findAll());

			// Para que veas que funciona un método hecho a medida
			// m.addAttribute("userList", service.findByUsername("Antonio"));
			return "GameList";
		}
		
		//Eliminar juego
		@GetMapping("/delete")
		public String deleteGame(@RequestParam("id") int id) {
			service.deleteById(id);
			return("redirect:/");
		}
		
		@GetMapping("/findByNintendo")
		public String nintendoList(Model model) {
			model.addAttribute("gameList", service.findAllNintendo());
			return("GameList");
		}

}

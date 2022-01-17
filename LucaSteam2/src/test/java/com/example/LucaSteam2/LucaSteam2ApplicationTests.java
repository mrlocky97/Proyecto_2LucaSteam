package com.example.LucaSteam2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.LucaSteam2.controller.GameController;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

class LucaSteam2ApplicationTests {

	@Autowired
	private GameController game;

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;	

	@Test
	void contextLoads() {
		assertThat(true).isTrue();

	}

	@Test
	void contextLoads2() {
		assertThat(game).isNotNull();
	}
	
	@Test
	void contextLoads3() {
		assertThat(restTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("GameList");
	}

	@Test
	void contextLoads4() {
		assertThat(restTemplate.getForObject("http://localhost:" + port + "/newGame", String.class))
				.contains("GameForm");
	}
	

}

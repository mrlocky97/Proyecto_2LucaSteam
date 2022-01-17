package com.example.LucaSteam2;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.LucaSteam2.controller.GameController;
import com.example.LucaSteam2.service.GameService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(GameController.class)

public class LucaSteam2ApplicationTests2 {
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	GameService serv;
	
	@Test
	void contextLoads5() throws Exception {
		mockMvc.perform(get("/test_hello"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hola Mundo")));
	}

	@Test
	void contextLoads6 () throws Exception {
		mockMvc.perform(get("/css/GameFormStyles.css"))
				.andDo(print())
				.andExpect(status().isOk());
	
			
	}
}

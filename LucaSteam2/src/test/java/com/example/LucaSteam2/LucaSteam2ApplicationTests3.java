package com.example.LucaSteam2;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
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
import com.example.LucaSteam2.model.Game;


@ExtendWith(SpringExtension.class)
@WebMvcTest(GameController.class)
public class LucaSteam2ApplicationTests3 {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	GameController contr;
	
	@Test
	void contextLead7() throws Exception {
		when(contr.helloWorld()).thenReturn("Correct");
		
		mockMvc
			.perform(get("/test_hello"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpectAll(content().string(containsString("Correct")));
	}
	
}

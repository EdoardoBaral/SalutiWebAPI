package com.xantrix.webapp.controllers;

import org.junit.jupiter.api.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SalutiController.class)
public class SalutiControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void testSaluti() throws Exception {
		mockMvc.perform(get("/api/saluti").contentType(String.valueOf(MediaType.APPLICATION_JSON)))
			   .andExpect(status().isOk())
			   .andExpect(jsonPath("$").value("Saluti, sono il tuo primo Web Service creato con SpringBoot!!"))
			   .andDo(print());
	}
	
	@Test
	void testSaluti2() throws Exception {
		mockMvc.perform(get("/api/saluti/Edoardo").contentType(String.valueOf(MediaType.APPLICATION_JSON)))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$").value("Saluti Edoardo, sono il tuo primo Web Service creato con SpringBoot!!"))
			.andDo(print());
	}
}

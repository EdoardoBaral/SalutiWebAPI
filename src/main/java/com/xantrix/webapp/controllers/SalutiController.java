package com.xantrix.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/saluti")
public class SalutiController {

	@GetMapping
	public String saluti() {
		return "Saluti, sono il tuo primo Web Service creato con SpringBoot!!";
	}
}

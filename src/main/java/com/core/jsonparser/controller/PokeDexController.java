package com.core.jsonparser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.jsonparser.model.Pokemon;
import com.core.jsonparser.service.IJsonProcessor;

@Controller
public class PokeDexController {
	
	@Autowired
	IJsonProcessor<Pokemon> pokemonJsonProcessor;
	
}

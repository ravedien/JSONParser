package com.core.jsonparser.service;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.stereotype.Service;

import com.core.jsonparser.model.Pokemon;
import com.core.jsonparser.util.AppUtil;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

@Service
public class PokemonJsonProcessor implements IJsonProcessor<Pokemon>{

	private static final String PATH = "src/main/resources/pokelist.json";
	private static final Type POKE_TYPE = new TypeToken<List<Pokemon>>(){}.getType(); 
		
	@Override
	public List<Pokemon> getJSONtoListObject() {
		Gson gson = new Gson();
		List<Pokemon> pokemonList = gson.fromJson(getJSONdata(), POKE_TYPE);
		return pokemonList;
	}

	private String getJSONdata() {
		String content = "";
		
		try{
			content = AppUtil.readFile(PATH, StandardCharsets.UTF_8);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return content;
	}
	
}

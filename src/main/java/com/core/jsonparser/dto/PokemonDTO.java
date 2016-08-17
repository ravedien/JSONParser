package com.core.jsonparser.dto;

import java.util.List;

import com.core.jsonparser.model.Pokemon;

public class PokemonDTO {
	
	private List<Pokemon> pokemonList;

	public PokemonDTO() {
		super();
	}

	public List<Pokemon> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(List<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}
	
}

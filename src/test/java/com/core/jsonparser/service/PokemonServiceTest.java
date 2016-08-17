package com.core.jsonparser.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.core.jsonparser.model.Pokemon;

public class PokemonServiceTest {

	
	@Test
	public void test() {
		
		IJsonProcessor<Pokemon> PokemonJsonProcessor = new PokemonJsonProcessor();
		List<Pokemon> pokeList = PokemonJsonProcessor.getJSONtoListObject();
		for(Pokemon poke : pokeList){
			System.out.println("Pokemon ID: "+poke.getNumber());
			System.out.println("Name: "+poke.getName());
			System.out.println("Classification: "+poke.getClassification());
			
			if(poke.getTypeI()!=null){
				System.out.println("Type I: "+poke.getTypeI());
			}
			if(poke.getTypeII()!=null){
				System.out.println("Type II: "+poke.getTypeII());
			}
			if(poke.getWeaknesses()!=null){
				System.out.println("Weaknesses : "+poke.getWeaknesses());
			}
			if(poke.getFastAttacks()!=null){
				System.out.println("Fast Attacks : "+poke.getFastAttacks());
			}
			if(poke.getSpecialAttacks() != null){
				System.out.println("Special Attacks : "+poke.getSpecialAttacks());
			}
			System.out.println("Weight : "+poke.getWeight());
			System.out.println("Height : "+poke.getHeight());
			if(poke.getNextEvolutionRequirements() != null){
				System.out.println("Next Evolution Requirements");
				System.out.println("	Item Needed: "+poke.getNextEvolutionRequirements().getName());
				System.out.println("	Item Count: "+poke.getNextEvolutionRequirements().getAmount());
			}
			if(poke.getNextEvolutions() != null){
				System.out.println("Next Evolutions");
				poke.getNextEvolutions().forEach(eaPoke -> System.out.println("	"+eaPoke.getName()));
			}
			if(poke.getPreviousEvolutions() != null){
				System.out.println("Previous Evolutions");
				poke.getPreviousEvolutions().forEach(eaPoke -> System.out.println("	"+eaPoke.getName()));
			}
			System.out.println(" ---------------------------------------- ");
		}
	}

}

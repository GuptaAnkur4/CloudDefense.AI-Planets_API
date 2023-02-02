package com.example.demo.entity;

import java.util.List;

public class PlanetBasicDetails
{
	private String name;
	private String population;
	private String climate;
	private List<Integer> residentsID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public List<Integer> getResidentsID() {
		return residentsID;
	}
	public void setResidentsID(List<Integer> residentsID) {
		this.residentsID = residentsID;
	}
	
	public PlanetBasicDetails(String name, String population, String climate, List<Integer> residentsID) {
		this.name = name;
		this.population = population;
		this.climate = climate;
		this.residentsID = residentsID;
	}
	
	public PlanetBasicDetails()
	{
		
	}
}
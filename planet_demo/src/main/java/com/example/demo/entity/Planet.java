package com.example.demo.entity;

import java.util.List;

public class Planet {
	
	private String name;
	private int rotation_period;
	private int orbital_period;
	private int diameter;
	private String climate;
	private String gravity;
	private String terrain;
	private String surface_water;
	private String population;
	private List<String> residents;
	private List<String> films;
	private String created;
	private String edited;
	private String url;
	
	public int getRotation_period() {
		return rotation_period;
	}
	public void setRotation_period(int rotation_period) {
		this.rotation_period = rotation_period;
	}
	public int getOrbital_period() {
		return orbital_period;
	}
	public void setOrbital_period(int orbital_period) {
		this.orbital_period = orbital_period;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getGravity() {
		return gravity;
	}
	public void setGravity(String gravity) {
		this.gravity = gravity;
	}
	public String getTerrain() {
		return terrain;
	}
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	public String getSurface_water() {
		return surface_water;
	}
	public void setSurface_water(String surface_water) {
		this.surface_water = surface_water;
	}
	public List<String> getFilms() {
		return films;
	}
	public void setFilms(List<String> films) {
		this.films = films;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getEdited() {
		return edited;
	}
	public void setEdited(String edited) {
		this.edited = edited;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
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
	public List<String> getResidents() {
		return residents;
	}
	public void setResidents(List<String> resident) {
		residents = resident;
	}
	
	public Planet(String name, int rotation_period, int orbital_period, int diameter, String climate, String gravity,
			String terrain, String surface_water, String population, List<String> residents, List<String> films,
			String created, String edited, String url)
	{
		this.name = name;
		this.rotation_period = rotation_period;
		this.orbital_period = orbital_period;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.surface_water = surface_water;
		this.population = population;
		this.residents = residents;
		this.films = films;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}
	
	public Planet()
	{
		
	}
}

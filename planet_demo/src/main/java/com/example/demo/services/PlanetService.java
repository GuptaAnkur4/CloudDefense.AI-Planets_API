package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Planet;
import com.example.demo.entity.PlanetBasicDetails;

@Repository
public interface PlanetService {
	
	public List<Planet> getPlanets();
	
	public PlanetBasicDetails getPlanet(String planet);
	
}

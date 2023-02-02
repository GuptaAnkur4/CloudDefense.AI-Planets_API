package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Galaxy;
import com.example.demo.entity.Planet;
import com.example.demo.entity.PlanetBasicDetails;
import com.example.demo.services.PlanetService;

@RestController
public class Controller {
	
	@Autowired
	private PlanetService planetService;
	
	@GetMapping("/hello")
	public String details() {
		return "Hello";
	}
	
	@GetMapping("/planets")
	public List<Planet> getPlanets()
	{
		return this.planetService.getPlanets();
	}
	
	@GetMapping("/planets/{planet}")
	public PlanetBasicDetails getPlanet(@PathVariable String planet)
	{
		
		return this.planetService.getPlanet(planet);
	}
}

package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Galaxy;
import com.example.demo.entity.Planet;
import com.example.demo.entity.PlanetBasicDetails;

@Service
public class PlanetServiceImpl implements PlanetService {

	final String url = "https://swapi.dev/api/planets/";
	RestTemplate restTemplate = new RestTemplate();
	Galaxy galaxy = restTemplate.getForObject(url, Galaxy.class);
	List<Planet> planets= galaxy.getResults();
	
	public List<Planet> getPlanets() {
		// TODO Auto-generated method stub
		return planets;
	}
	
	public PlanetBasicDetails getPlanet(String planet)
	{
		Planet p=new Planet();
		for(Planet p1: planets)
		{
			if(p1.getName().equals(planet))
			{
				p=p1;
				break;
			}
		}
		
		PlanetBasicDetails p1= new PlanetBasicDetails();
		p1.setName(p.getName());
		p1.setPopulation(p.getPopulation());
		p1.setClimate(p.getClimate());
		
		List<Integer> id= new ArrayList<>();
		for(String s:p.getResidents())
		{
			String[] s1= s.split("/");
			id.add(Integer.parseInt(s1[5]));
		}
		p1.setResidentsID(id);
		return p1;
	}

}

package com.bharat.locationweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.locationweb.entities.Location;
import com.bharat.locationweb.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {
	
	@Autowired
	private LocationRepository locationrepository;

	
	@GetMapping
	public List<Location> getLocations(){
		return (List<Location>) locationrepository.findAll();
		
	}

}

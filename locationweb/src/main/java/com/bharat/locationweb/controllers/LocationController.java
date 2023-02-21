package com.bharat.locationweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bharat.locationweb.entities.Location;
import com.bharat.locationweb.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	private LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap model) {
		Location saveLocation = service.saveLocation(location);
		String msg = "Location save with ID " + saveLocation.getId();
		model.addAttribute("msg", msg);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayAllLocation(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocationById(@RequestParam("id") int id) {
		 Location locationById = service.getLocationById(id);
		service.deleteLocation(locationById);
		return "displayLocations";
		
	}
}


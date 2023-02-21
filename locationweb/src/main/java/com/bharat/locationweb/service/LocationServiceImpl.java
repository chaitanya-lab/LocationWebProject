package com.bharat.locationweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharat.locationweb.entities.Location;
import com.bharat.locationweb.repos.LocationRepository;


@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repo;
	
	@Override
	public Location saveLocation(Location location) {
	
		return repo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		
		return null;
	}

	@Override
	public void deleteLocation(Location location) {
	  repo.deleteById(location.getId());

	}

	@Override
	public Location getLocationById(int id) {
		return null;
	}

	@Override
	public List<Location> getAllLocations() {
	
		return (List<Location>) repo.findAll();
	}

}

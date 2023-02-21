package com.bharat.locationweb.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharat.locationweb.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}

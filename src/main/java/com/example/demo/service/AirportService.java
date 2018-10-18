package com.example.demo.service;

import com.example.demo.model.Airport;
import com.example.demo.model.Location;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.demo.repository.AirportRepository;

@Service
public class AirportService {

    @Autowired
    AirportRepository repository;

    /**
     *  Given the id number find the airport
     *
     *  @param id unique number for airport
     *  @return airport information
     */
    public Airport findAirport(int id){
        return repository.findAirport(id);
    }

    /**
     *  Retrieve all airports within in a given region.
     *
     *  @param location of current map view
     * @return list of airports in the given radius.
     */
    public List<Airport> getAllAirports(Location location){
        return repository.getAllAirports(location);
    }
}

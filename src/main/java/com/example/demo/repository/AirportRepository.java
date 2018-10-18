package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Airport;
import com.example.demo.model.Location;

public interface AirportRepository {

    /**
     *  Given the id number find the airport
     *
     *  @param id unique number for aiport
     *  @return airport information
     */
    @Query(value="Select * from airport where id = ?1", nativeQuery=true)
    Airport findAirport(int id);

    /**
     *  Retrieve all airports within in a given region.
     *
     *  @param location of current map view
     * @return list of airports in the given radius.
     */
    @Query(value="Select * from airport where lattitdue = ?l and longitude = ?l", nativeQuery=true)
    List<Airport> getAllAirports(Location location);
}

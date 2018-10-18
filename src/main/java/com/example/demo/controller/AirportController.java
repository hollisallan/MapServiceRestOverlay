package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.model.Airport;
import com.example.demo.model.Location;
import com.example.demo.service.AirportService;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    AirportService service;

    private static Map<String, String> successHeader;
    static {
        successHeader = new HashMap<>();
        successHeader.put("successcode", "00");
        successHeader.put("successDesc", "Success");
        successHeader.put("contentType", "application/json");
    }

    /**
     *  Given the id number find the airport
     *
     *  @param id unique number for airport
     *  @return airport information
     */
    @GetMapping(value="/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Airport> findAirport(@PathVariable("id")int id){

        HttpHeaders headers = new HttpHeaders();
        headers.add("responseCode", successHeader.get("successCode"));
        headers.add("responseDesc", successHeader.get("successDesc"));
        headers.add(HttpHeaders.CONTENT_TYPE, successHeader.get("contentType"));

        Airport aiport = service.findAirport(id);
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(aiport);
    }

    /**
     *  Retrieve all airports within in a given region.
     *
     *  @param location of current map view
     * @return list of airports in the given radius.
     */
    @GetMapping(value="/location/{location}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Airport>> getAllAirports(@PathVariable("location")Location location){

        HttpHeaders headers = new HttpHeaders();
        headers.add("responseCode", successHeader.get("successCode"));
        headers.add("responseDesc", successHeader.get("successDesc"));
        headers.add(HttpHeaders.CONTENT_TYPE, successHeader.get("contentType"));

        List<Airport> airport = service.getAllAirports(location);
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(airport);
    }
}

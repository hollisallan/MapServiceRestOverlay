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

import com.example.demo.model.Navaid;
import com.example.demo.model.Location;
import com.example.demo.service.NavaidService;

@RestController
@RequestMapping("/navaids")
public class NavaidsController {
	@Autowired
    NavaidService service;

    private static Map<String, String> successHeader;
    static {
        successHeader = new HashMap<>();
        successHeader.put("successcode", "00");
        successHeader.put("successDesc", "Success");
        successHeader.put("contentType", "application/json");
    }

    /**
     *  Given the id number find the navaid
     *
     *  @param id unique number for navaid
     *  @return navaid information
     */
    @GetMapping(value="/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Navaid> findAirport(@PathVariable("id")int id){

        HttpHeaders headers = new HttpHeaders();
        headers.add("responseCode", successHeader.get("successCode"));
        headers.add("responseDesc", successHeader.get("successDesc"));
        headers.add(HttpHeaders.CONTENT_TYPE, successHeader.get("contentType"));

        Navaid navaid = service.findNavaid(id);
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(navaid);
    }

    /**
     *  Retrieve all navaids within in a given region.
     *
     *  @param location of current map view
     * @return list of navaids in the given radius.
     */
    @GetMapping(value="/location/{location}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Navaid>> getAllNavaids(@PathVariable("location")Location location){

        HttpHeaders headers = new HttpHeaders();
        headers.add("responseCode", successHeader.get("successCode"));
        headers.add("responseDesc", successHeader.get("successDesc"));
        headers.add(HttpHeaders.CONTENT_TYPE, successHeader.get("contentType"));

        List<Navaid> navaid = service.getAllNavaids(location);
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(navaid);
    }
}

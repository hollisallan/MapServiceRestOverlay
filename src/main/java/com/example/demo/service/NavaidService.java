package com.example.demo.service;

import com.example.demo.model.Navaid;
import com.example.demo.model.Location;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.repository.NavaidRepository;

@Service
public class NavaidService {

    @Autowired
    NavaidRepository repository;

    /**
     *  Given the id number find the navaid
     *
     *  @param id unique number for navaid
     *  @return navaid information
     */
    public Navaid findNavaid(int id){
        return repository.findNavaid(id);
    }

    /**
     *  Retrieve all navaids within in a given region.
     *
     *  @param location of current map view
     * @return list of navaids in the given radius.
     */
    public List<Navaid> getAllNavaids(Location location){
        return repository.getAllNavaids(location);
    }
}

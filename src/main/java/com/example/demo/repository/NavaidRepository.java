package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.demo.model.Navaid;
import com.example.demo.model.Location;

@Repository
public interface NavaidRepository {

	/**
	 *  Given the id number find the navaid
	 *
	 *  @param id unique number for navaid
	 *  @return navaid information
	 */
	@Query(value="Select * from navaid where id = ?1", nativeQuery=true)
	Navaid findNavaid(int id);

	/**
	 *  Retrieve all navaids within in a given region.
	 *
	 *  @param location of current map view
	 * @return list of navaids in the given radius.
	 */
	@Query(value="Select * from navaids where lattitdue = ?l and longitude = ?l", nativeQuery=true)
	List<Navaid> getAllNavaids(Location location);
}

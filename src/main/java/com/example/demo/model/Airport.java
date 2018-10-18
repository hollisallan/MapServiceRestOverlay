package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="airport")
public class Airport {
	@Id
	private int id;
	private String indent;
	private String name;
	private double latitude;
	private double longitude;
	private int elevation;
	private String isoCountry;
	private String isoRegion;
	private String gpsCode;
	private Location location;
	
	public Airport(){}

	@Column(name="id")
	public int getID(int id){

		return id;
	}

	public void setID(int id){

		this.id = id;
	}

	@Column(name="indent")
	public String getIndent(String indent){

		return indent;
	}

	public void setIndent(String indent){

		this.indent = indent;
	}

	@Column(name="name")
	public String getName(String name){

		return name;
	}

	public void setName(String name){

		this.name = name;
	}

	public Location getLocation(Location location){
		return location;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	@Column(name="latitude")
	public double getLatitude(double latitude){

		return latitude;
	}

	public void setLatitude(double latitude){

		this.latitude = latitude;
	}

	@Column(name="longitude")
	public double getLongitude(double longitude){

		return longitude;
	}

	@Column(name="elevation")
	public int getElevation(int elevation){

		return elevation;
	}

	public void setElevation(int elevation){

		this.elevation = elevation;
	}

	@Column(name="isoCountry")
	public String getIsoCountry(String isoCountry){

		return isoCountry;
	}

	public void setIsoCountry(String isoCountry){

		this.isoCountry = isoCountry;
	}

	@Column(name="isoRegion")
	public String getIsoRegion(String isoRegion){

		return isoRegion;
	}

	public void setIsoRegion(String isoRegion){

		this.isoRegion = isoRegion;
	}

	@Column(name="gpdCode")
	public String getGpsCode(String gpsCode){

		return gpsCode;
	}
	
	public void setGpsCode(String gpsCode){

		this.gpsCode = gpsCode;
	}

}
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="navaids")
public class Navaid {
	@Id
	private int id;
	private String indent;
	private String name;
	private double latitude;
	private double longitude;
	private int elevation;
	private int frequency;
	private String isoCountry;
	private String gpsCode;

	public Navaid(){}

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

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	@Column(name="elevation")
	public int getElevation(int elevation){
		return elevation;
	}

	public void setElevation(int elevation){
		this.elevation = elevation;
	}

	@Column(name="frequency")
	public int getFrequency(int frequency){
		return frequency;
	}

	public void setFrequency(int frequency){
		this.frequency = frequency;
	}

	@Column(name="isoCountry")
	public String getIsoCountry(String isoCountry){
		return isoCountry;
	}

	public void setIsoCountry(String isoCountry){
		this.isoCountry = isoCountry;
	}
}

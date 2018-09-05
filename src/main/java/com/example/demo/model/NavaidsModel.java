package com.example.demo.model;

public class NavaidsModel {
	private int id;
	private String indent;
	private String name;
	private double latitude;
	private double longitude;
	private int elevation;
	private int frequency;
	private String isoCountry;
	private String gpsCode;
	
	public int getID(int id){
		return id;
	}
	
	public String getIndent(String indent){
		return indent;
	}
	
	public String getName(String name){
		return name;
	}
	
	public double getLatitude(double latitude){
		return latitude;
	}
	
	public double getLongitude(double longitude){
		return longitude;
	}
	
	public int getElevation(int elevation){
		return elevation;
	}
	
	public int getFrequency(int frequency){
		return frequency;
	}
	
	public String getIsoCountry(String isoCountry){
		return isoCountry;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public void setIndent(String indent){
		this.indent = indent;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLatitude(double latitude){
		this.latitude = latitude;
	}
	
	public void setLongitude(double longitude){
		this.longitude = longitude;
	}
	
	public void setElevation(int elevation){
		this.elevation = elevation;
	}
	
	public void setIsoCountry(String isoCountry){
		this.isoCountry = isoCountry;
	}
}

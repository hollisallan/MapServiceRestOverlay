package com.example.demo.model;

public class AirportModel {
	private int id;
	private String indent;
	private String name;
	private double latitude;
	private double longitude;
	private int elevation;
	private String isoCountry;
	private String isoRegion;
	private String gpsCode;
	
	public AirportModel(){
	}
	
	public AirportModel(int id, String indent, 
			String name, double latitude, double longitude, 
			int elevation, String isoCountry, String isoRegion, 
			String gpsCode){
		this.id = id;
		this.indent = indent;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		this.isoCountry = isoCountry;
		this.isoRegion = isoRegion;
		this.gpsCode = gpsCode;
	}
	
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
	
	public String getIsoCountry(String isoCountry){
		return isoCountry;
	}
	
	public String getIsoRegion(String isoRegion){
		return isoRegion;
	}
	
	public String getGpsCode(String gpsCode){
		return gpsCode;
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
	
	public void setIsoRegion(String isoRegion){
		this.isoRegion = isoRegion;
	}
	
	public void setGpsCode(String gpsCode){
		this.gpsCode = gpsCode;
	}

}

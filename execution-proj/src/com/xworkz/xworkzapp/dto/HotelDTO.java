package com.xworkz.xworkzapp.dto;

public class HotelDTO {
	private String name;
	private String location;
	private int noOfEmployes;

	public HotelDTO(String name, String location, int noOfEmployes) {
		super();
		this.name = name;
		this.location = location;
		this.noOfEmployes = noOfEmployes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfEmployes() {
		return noOfEmployes;
	}

	@Override
	public String toString() {
		return "HotelDTO [name=" + name + ", location=" + location + ", noOfEmployes=" + noOfEmployes + "]";
	}

}

package com.xworkz.xworkzapp.flight;

public class FlightBookingDTO {
	private double code;
	private String comapny;
	private String startingPoint;
	private String Destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private long economyClassPrice;

	public double getCode() {
		return code;
	}

	public void setCode(double code) {
		this.code = code;
	}

	public String getComapny() {
		return comapny;
	}

	public void setComapny(String comapny) {
		this.comapny = comapny;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public double getBusinessClassPrice() {
		return businessClassPrice;
	}

	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}

	public long getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(long economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public Boolean getDomestic() {
		return domestic;
	}

}

package com.xworkz.xworkzapp.operation;

import com.xworkz.xworkzapp.flight.FlightBookingDTO;

public class FlightBooking {
	FlightBookingDTO[] flights=new FlightBookingDTO[4];
	public int index;
	
	
	public void addFlightsBookingDetails(FlightBookingDTO flights) {
		if(flights.getCode() != 0 && flights.getComapny() != null && flights.getStartingPoint() != null
				&&flights.getBusinessClassPrice() != 0) {
			if(flights.getBusinessClassPrice()>=1000) {
				this.flights[index++] =flights;
			}
			else {
				System.out.println("price should be greater than 1000");
			}
		}
		else {
			System.out.println("flight booking details are not added as it is null");

		}
	}
		
	public void displayAllDetails() {
		for (int i = 0; i < flights.length; i++) {
			if(flights[i] != null) {
				System.out.println(flights[i].getStartingPoint() +" " +flights[i].getCode() +" "
						+flights[i].getComapny()+" "+ flights[i].getDestination()+" "+ 
						flights[i].getTotalSeats()+" "+flights[i].getEconomyClassPrice()+" "+
						flights[i].getBusinessClassPrice()+" "+flights[i].getDomestic());
			}
			else if(flights[i] == null) {
				System.out.println("please add all the details");
			}
		}
	}


	public void searchByStartingPoint(String startingPoint) {
		for (int i = 0; i < flights.length; i++) {
			if(flights[i] != null) {
				if(flights[i].getStartingPoint().equals(startingPoint)) {
					System.out.println(flights[i].getStartingPoint() +" " +flights[i].getCode() +" "
							+flights[i].getComapny()+" "+ flights[i].getDestination()+" "+ 
							flights[i].getTotalSeats()+" "+flights[i].getEconomyClassPrice()+" "+
							flights[i].getBusinessClassPrice()+" "+flights[i].getDomestic());

			}
				else {
					System.out.println("not correct starting point");
				}
		}
	}
	}
	}
		
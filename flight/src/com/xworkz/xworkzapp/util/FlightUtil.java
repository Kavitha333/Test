package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.flight.FlightBookingDTO;
import com.xworkz.xworkzapp.operation.FlightBooking;

public class FlightUtil {
	public static void main(String[] args) {
		FlightBooking f=new FlightBooking();
		FlightBookingDTO flight=new FlightBookingDTO();
		flight.setCode(1222222221);
		flight.setComapny("AirIndia");
		flight.setStartingPoint("bengaluru");
		flight.setDestination("Mangaluru");
		flight.setTotalSeats(50);
		flight.setDomestic(true);
		flight.setBusinessClassPrice(1000.00);
		flight.setEconomyClassPrice(500);
		f.addFlightsBookingDetails(flight);
		
		FlightBookingDTO flightOne=new FlightBookingDTO();
		flightOne.setCode(1222222221);
		flightOne.setComapny("AirIndia");
		flightOne.setStartingPoint("bengaluru");
		flightOne.setDestination("Mangaluru");
		flightOne.setTotalSeats(50);
		flightOne.setDomestic(true);
		flightOne.setBusinessClassPrice(1000.00);
		flightOne.setEconomyClassPrice(500);
		f.addFlightsBookingDetails(flightOne);
		f.displayAllDetails();
		
		
		
		f.searchByStartingPoint("bengaluru");
		System.out.println(flight.getStartingPoint() +" " +flight.getCode() +" "
				+flight.getComapny()+" "+ flight.getDestination()+" "+ 
				flight.getTotalSeats()+" "+flight.getEconomyClassPrice()+" "+
				flight.getBusinessClassPrice()+" "+flight.getDomestic());
System.out.println(flightOne.getStartingPoint() +" " +flightOne.getCode() +" "
				+flightOne.getComapny()+" "+ flightOne.getDestination()+" "+ 
				flightOne.getTotalSeats()+" "+flightOne.getEconomyClassPrice()+" "+
				flightOne.getBusinessClassPrice()+" "+flightOne.getDomestic());
		
	}

}


















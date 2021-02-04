package com.xworkz.xworkzapp.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.xworkzapp.dao.HotelDAOImpl;
import com.xworkz.xworkzapp.dto.HotelDTO;

public class HotelTester {

	public static void main(String[] args) {

		HotelDTO hotelDTO1 = new HotelDTO("Harihara", "Mysuru", 24);
		HotelDTO hotelDTO2 = new HotelDTO("Swanpa", "mangalore", 10);
		HotelDTO hotelDTO3 = new HotelDTO("Sumadhura", "bangalore", 45);
		
		List<HotelDTO> list = new ArrayList<HotelDTO>();
		

		HotelDAOImpl hotelDAOImpl=new HotelDAOImpl(list);
		
		hotelDAOImpl.save(hotelDTO3);
		

		
		hotelDAOImpl.findByName("Harihara");
		hotelDAOImpl.deleteByNameAndLocation("Swapn", "mangalore");

	}
}

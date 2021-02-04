package com.xworkz.xworkzapp.dao;

import java.util.Collection;

import com.xworkz.xworkzapp.dto.HotelDTO;

public interface HotelDAO {

	HotelDTO findByName(String name);
	boolean save(HotelDTO dto);
	boolean updateLocationByName(String name, String location);
	boolean deleteByNameAndLocation(String name, String location);

	

}

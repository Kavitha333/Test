package com.xworkz.xworkzapp.dao;

import java.util.List;

import java.util.Iterator;

import com.xworkz.xworkzapp.dto.HotelDTO;

public class HotelDAOImpl implements HotelDAO {

	private List<HotelDTO> hotelList;

	public HotelDAOImpl(List<HotelDTO> hotelDTOs) {
		System.out.println("Create hotelDAOImpl");
		this.hotelList = hotelDTOs;
	}

	@Override
	public boolean save(HotelDTO dto) {
		System.out.println("invoked save");
		boolean added = this.hotelList.add(dto);
		System.out.println("added : " + added);
		return false;
	}

	@Override
	public HotelDTO findByName(String name) {
		System.out.println("Invoked findByName ");
		for (HotelDTO cosmeticDTO : hotelList) {
			String resortName = cosmeticDTO.getName();
			if (resortName.equals(name)) {
				System.out.println("Hotel name is found");
				return cosmeticDTO;
			} else {
				System.out.println("Hotel name is not found");
			}
		}
		return null;
	}

	@Override
	public boolean updateLocationByName(String name, String location) {
		System.out.println("Invoked updateLocationByName ");
		System.out.println("Loaction :" + location);
		System.out.println("Name :" + name);
		HotelDTO hotelDTO = this.findByName(name);
		if (hotelDTO != null) {
			System.out.println("can found,you can update the location of Hotel ");
			3.
			hotelDTO.setLocation(location);
			hotelDTO.setName(name);
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("Invoked deleteBynameAndLocation");
		Iterator<HotelDTO> iterator = this.hotelList.iterator();
		while (iterator.hasNext()) {
			HotelDTO dto = iterator.next();
			if (dto.getName().equals(name) && dto.getLocation().equals(location)) {
				System.out.println("Name and location is found you can delete the hotel");
				iterator.remove();
				System.out.println("After deleting the hotel");
				return true;
			} else {
				System.out.println("Name location is not found");
			}
		}
		return false;

	}

	

}

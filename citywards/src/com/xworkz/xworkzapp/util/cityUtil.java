package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.citywards.City;
import com.xworkz.xworkzapp.citywards.CityWardsDTO;

public class cityUtil {
	public static void main(String[] args) {
		
		City city=new City();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			CityWardsDTO citywardsDTO=new CityWardsDTO();
			
			System.out.println("Enter the wardnumber");
			String wardNumber=sc.next();
			System.out.println("Enter the wardName");
			String wardName=sc.next();
			System.out.println("Enter the corporatorName");
			String corporatorName=sc.next();
			System.out.println("Enter the population");
			
			//Long p=(long) 0,q= (long)5000;
			//if( p < q) 
			Long population=sc.nextLong();
		
			citywardsDTO.setWardNumber(wardNumber);
			citywardsDTO.setWardName(wardName);
			citywardsDTO.setCorporatorName(corporatorName);
			citywardsDTO.setPopulation(population);
			
			//city.addCityWards(citywardsDTO);
			}
		city.displayAllCityWards();
		
		System.out.println("Enter the wardname");
		String name=sc.next();
		city.searchCityWardbyName(name);
		city.displayAllCityWards();
		
		System.out.println("Enter the corperatorname and wardnumber");
		String corporatorName=sc.next();
		String wardNumber=sc.next();
		CityWardsDTO[] c=city.corporatorByWardNumber(corporatorName, wardNumber);
		System.out.println(corporatorName+ " "+ wardNumber);
		
		city.displayAllCityWards();

		
		
	}

}

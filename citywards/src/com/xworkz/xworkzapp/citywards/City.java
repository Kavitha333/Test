package com.xworkz.xworkzapp.citywards;

public class City {
	
	public CityWardsDTO[] citywards=new CityWardsDTO[10];
	public  int currentIndex;
	
	public City() {
		System.out.println("city object is created");
	}
	
	public void addCityWards(CityWardsDTO citywards) {
		if(citywards!=null) {
			this.citywards[currentIndex]=citywards;
			this.currentIndex++;
		      }
				if(citywards==null) {
					System.out.println("not found");
				}
		
	}
	
	public void searchCityWardbyName(String name) {
		for (int  i= 0;  i< citywards.length; i++) {
			if (citywards[i]!=null) {
				if(citywards[i].getWardName().equals(name)) {
					citywards[i].setWardName(name);
					System.out.println(citywards[i].getWardName()+ " "+citywards[i].getWardNumber()+ " "+citywards[i].getPopulation());
				}
			}
		}
	}
	
	public CityWardsDTO[] corporatorByWardNumber(String corporatorName,String  wardNumber) {
		for (int i = 0; i < citywards.length; i++) {
			if(citywards[i]!=null) {
				if(citywards[i].getWardNumber().equals(wardNumber)) {
					citywards[i].setWardNumber(wardNumber);
					citywards[i].setCorporatorName(corporatorName);
					
			//System.out.println(citywards[i].getWardName()+ " "+citywards[i].getWardNumber()+ " "+citywards[i].getPopulation());
					
				}
			  }
			}
		return citywards;
	}
		
		public  void displayAllCityWards() {
			for (int i = 0; i < citywards.length; i++) {
				if(citywards[i]!=null) {
					System.out.println(citywards[i].getWardName()+ " "+citywards[i].getWardNumber()+ " "+citywards[i].getPopulation());
				}
			}	
	}
}














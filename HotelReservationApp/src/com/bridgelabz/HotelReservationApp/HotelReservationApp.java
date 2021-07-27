package com.bridgelabz.HotelReservationApp;

public class HotelReservationApp {

	public static void addHotels() {	
		Hotels hotel1 = new Hotels("LakeWood",110);
		Hotels hotel2 = new Hotels("BridgeWood",160);
		Hotels hotel3 = new Hotels("RidgeWood",220);
		
		HotelReservation obj = new HotelReservation();
		obj.addHotelsToList(hotel1);
		obj.addHotelsToList(hotel2);
		obj.addHotelsToList(hotel3);
		
		obj.getHotelList().stream().forEach((hotelList) -> System.out.println(hotelList));
	}
	public static void main(String [] args){
		System.out.println("Welcome to The Hotel Reservation System");
		addHotels();
}
}

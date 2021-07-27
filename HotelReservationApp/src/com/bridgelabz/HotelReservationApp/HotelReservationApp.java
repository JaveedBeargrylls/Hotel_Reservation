package com.bridgelabz.HotelReservationApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class HotelReservationApp {
	
	static HotelReservation obj = new HotelReservation();
	
	public static void addHotels() {	
		Hotels hotel1 = new Hotels("LakeWood",110);
		Hotels hotel2 = new Hotels("BridgeWood",160);
		Hotels hotel3 = new Hotels("RidgeWood",220);
		
		
		obj.addHotelsToList(hotel1);
		obj.addHotelsToList(hotel2);
		obj.addHotelsToList(hotel3);
		
		obj.getHotelList().stream().forEach((hotelList) -> System.out.println(hotelList));
	}
	
	// cheapest hotel
	public static Hotels findCheapest(String start, String end) throws ParseException {
		Date startDate;
		Date endDate;
		
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
		
		startDate = formatter.parse(start);
		endDate = formatter.parse(end);
		
		long range = endDate.getTime() - startDate.getTime();
		//System.err.println(range); // err for accept output data
		long daterange = 1 + range / (1000 * 60 * 60 * 24);
		
		Hotels cheapestHotel = obj.getHotelList().stream().sorted(Comparator.comparing(Hotels::getRate)).findFirst().orElse(null);
		
		long totalRate = daterange * cheapestHotel.getRate();
		cheapestHotel.setTotalRate(totalRate);

		return cheapestHotel;
		
	}
	public static void main(String [] args){
		System.out.println("Welcome to The Hotel Reservation System");
		addHotels();
		
		// finding the chepest hotel input dates
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the Date to start the visit in ddMMYYYY format");
		String startDate = sc.next();
		System.out.println("ENter the Date to End the visit in ddMMYYYY format");
		String endDate = sc.next();
		Hotels cheapestHotel = null;
		try {
			cheapestHotel = findCheapest(startDate, endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(cheapestHotel.getHotelName()+" Total price is $ "+cheapestHotel.getTotalRate());
		sc.close();
}
}

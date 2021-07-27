package com.bridgelabz.HotelReservationApp;


public class Hotels {
	private String hotelName;
	private int rate;
	
	public Hotels(String hotelName, int rate) {
		this.hotelName = hotelName;
		this.rate = rate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRate() {
		return rate;
	}
	public void setRage(int rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Hotel [hotelName = "+hotelName+" Rate = "+rate+"]";
	}

}

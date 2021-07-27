package com.bridgelabz.HotelReservationApp;


public class Hotels {
	private String hotelName;
	private long totalRate;
	private int Rate;
	
	public long getTotalRate() {
		return totalRate;
	}
	public void setTotalRate(long totalRate) {
		this.totalRate = totalRate;
	}
	public Hotels(String hotelName,int Rate) {
		super();
		this.hotelName = hotelName;
		this.Rate = Rate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public void setRate(int Rate) {
		this.Rate = Rate;
	}
	public int getRate() {
		return Rate;
	}
	
	@Override
	public String toString() {
		return "Hotel [hotelName = "+hotelName+" Rate = "+Rate+"]";
	}

}

package com.bridgelabz.HotelReservationApp;


public class Hotels {
	private String hotelName;
	private long totalRate;
	private int weekDayRate;
	private int weekEndRate;
	
	
	public long getTotalRate() {
		return totalRate;
	}
	public void setTotalRate(long totalRate) {
		this.totalRate = totalRate;
	}
	public Hotels(String hotelName,int weekDayRate, int weekEndRate) {
		super();
		this.hotelName = hotelName;
		this.weekDayRate = weekDayRate;
		this.weekEndRate = weekEndRate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getWeekDayRate() {
		return weekDayRate;
	}
	public void setWeekDayRate(int weekDayRate) {
		this.weekDayRate = weekDayRate;
	}
	public int getWeekEndRate() {
		return weekEndRate;
	}
	public void setWeekEndRate(int weekEndRate) {
		this.weekEndRate = weekEndRate;
	}
	
	
	@Override
	public String toString() {
		return "Hotel [hotelName = "+hotelName+" WeekDays Rate = "+weekDayRate+" WeekEnds Rate = "+weekEndRate+"]";
	}

}
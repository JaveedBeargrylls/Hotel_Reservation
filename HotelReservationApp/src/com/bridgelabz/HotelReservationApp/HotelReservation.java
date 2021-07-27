package com.bridgelabz.HotelReservationApp;

	import java.util.ArrayList;

	public class HotelReservation {

		private ArrayList<Hotels> hotelList = new ArrayList<>();
		
		public ArrayList<Hotels> getHotelList(){
			return hotelList;
		}
		
		public void setHotelList(ArrayList<Hotels> hotelList) {
			this.hotelList = hotelList;
		}
		
		public void addHotelsToList(Hotels hotel) {
			hotelList.add(hotel);
		}
	}

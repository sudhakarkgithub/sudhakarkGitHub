package com.geek.test;

import java.util.ArrayList;
import java.util.List;

public class AmericanAirlines implements FlightOperations  {

	@Override
	public List getAllAvalilableFllights() {
		System.out.println("get all avaliable flight info");
		
		// here in this method they will have a service to connet with database
		// where they will find aval flight info
		// they will return this flight information to expedia ppl
		
		List list = new ArrayList<>();
		
		// they have connected to their whey it wil give all the aval flight info
		
		
		// ideally you are getting this list object from AA data base 
		
		
		return list;
		
	}
	
	
	@Override
	public boolean bookings(BookingObject bookingObject) {

		//   it has a different service to check the booking 
		// If everything sucees whcih means payment 
		// allow the customer to book Iternary
		
		boolean ispaymentSucees =  true;
		bookingObject.getStartdate();
		
		
		// this is going to call an another service where will it will deside 
		// the payment is sucess or not 
		
		if(ispaymentSucees) {
			
			return ispaymentSucees;
		}else {
			return ispaymentSucees;
		}
		
		
		
	}
}

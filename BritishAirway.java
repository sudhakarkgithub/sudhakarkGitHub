package com.geek.test;

import java.util.ArrayList;
import java.util.List;



public class BritishAirway implements FlightOperations {
	
	
	@Override
	public List getAllAvalilableFllights() {
		
		
		// here in this method they will have a service to connet with database
				// where they will find aval flight info
				// they will return this flight information to expedia ppl
		// this ppl may follow the different approach 
		List list = new ArrayList();
		
		return list;
	}
	
	@Override
	public boolean bookings(BookingObject bookingObject) {

		
		boolean ispaymentSucess= true;
		
		if(ispaymentSucess) {
			return ispaymentSucess;
		}
		
		return false;
	}

	
	
	
}

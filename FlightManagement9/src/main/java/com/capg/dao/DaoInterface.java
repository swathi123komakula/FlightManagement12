package com.capg.dao;

import java.util.List;

import com.capg.entity.Flightdetails;

public interface DaoInterface {

	Flightdetails deleteById(int id);

	List<Flightdetails> getAllFlightdetails();

	Flightdetails getFlightdetailsById(int id);

	Flightdetails FlightdetailsCreation(Flightdetails fli);

	Flightdetails UpdateFlightdetails(Flightdetails fli);
}

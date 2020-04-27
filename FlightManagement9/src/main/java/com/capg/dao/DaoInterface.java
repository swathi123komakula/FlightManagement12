package com.capg.dao;

import java.util.List;

import com.capg.entity.Flightschedule;

public interface DaoInterface {

	Flightschedule deleteById(int id);

	List<Flightschedule> getAllFlightschedule();

	Flightschedule getFlightscheduleById(int id);

	Flightschedule FlightscheduleCreation(Flightschedule fli);

	Flightschedule UpdateFlightschedule(Flightschedule fli);

	List<Flightschedule> getAllFlightscheudle();
}

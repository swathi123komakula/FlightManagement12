package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dao.DaoClass;
import com.capg.entity.Flightschedule;

@Service
@Transactional
public class ServiceClass 
{
@Autowired
DaoClass dao;

public Flightschedule FlightdetailsCreation(Flightschedule fli) {
	return dao.FlightscheduleCreation(fli);
}

public Flightschedule getFlightdetailsById(int id) 
{
return dao.getFlightscheduleById(id);
}

public List<Flightschedule> getAllFlightdetails() 
{
return dao.getAllFlightschedule();
}

public Flightschedule delete(int id) 
{
	return dao.deleteById(id);
}

public Flightschedule UpdateFlightdetails(Flightschedule fli) {
	return dao.UpdateFlightschedule(fli);	
}

}
package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dao.DaoClass;
import com.capg.entity.Flightdetails;

@Service
@Transactional
public class ServiceClass 
{
@Autowired
DaoClass dao;

public Flightdetails FlightdetailsCreation(Flightdetails fli) {
	return dao.FlightdetailsCreation(fli);
}

public Flightdetails getFlightdetailsById(int id) 
{
return dao.getFlightdetailsById(id);
}

public List<Flightdetails> getAllFlightdetails() 
{
return dao.getAllFlightdetails();
}

public Flightdetails delete(int id) 
{
	return dao.deleteById(id);
}

public Flightdetails UpdateFlightdetails(Flightdetails fli) {
	return dao.UpdateFlightdetails(fli);	
}

}
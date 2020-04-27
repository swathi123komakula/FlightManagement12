package com.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.entity.Flightschedule;

@Repository
public class DaoClass implements DaoInterface {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Flightschedule FlightscheduleCreation(Flightschedule fli) {
		// TODO Auto-generated method stub
		Flightschedule f=em.merge(fli);
		return f;
	}
	
	@Override
	public Flightschedule getFlightscheduleById(int id) {
		
		return em.find(Flightschedule.class,id);
	}
	
	@Override
	public List<Flightschedule> getAllFlightscheudle() {
		Query q=em.createQuery("select m from Flightdetails m");
		List<Flightschedule> flilist=q.getResultList();
		return flilist;
	}
	
	@Override
	public Flightschedule UpdateFlightschedule(Flightschedule fli) {
		Flightschedule f=em.find(Flightschedule.class,fli.getId());
		if(f!=null)
		{
			f.setId(fli.getId());
			f.setModel(fli.getModel());
			f.setCarriername(fli.getCarriername());
			f.setSeatcapacity(fli.getSeatcapacity());
			f.setSourceairport(fli.getSourceairport());
			f.setDestinationairport(fli.getDestinationairport());
			f.setArrivaltime(fli.getArrivaltime());
			f.setDeparturetime(fli.getDeparturetime());
		}
		return f;
			
	}

@Override	
public Flightschedule deleteById(int id) {
	Flightschedule f=em.find(Flightschedule.class,id);
	if(f!=null)
		{em.remove(f);
		}
    return f;
}

@Override
public List<Flightschedule> getAllFlightschedule() {
	// TODO Auto-generated method stub
	return null;
}
}


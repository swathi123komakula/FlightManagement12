package com.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.entity.Flightdetails;

@Repository
public class DaoClass implements DaoInterface {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Flightdetails FlightdetailsCreation(Flightdetails fli) {
		// TODO Auto-generated method stub
		Flightdetails f=em.merge(fli);
		return f;
	}
	
	@Override
	public Flightdetails getFlightdetailsById(int id) {
		
		return em.find(Flightdetails.class,id);
	}
	
	@Override
	public List<Flightdetails> getAllFlightdetails() {
		Query q=em.createQuery("select m from Flightdetails m");
		List<Flightdetails> flilist=q.getResultList();
		return flilist;
	}
	
	@Override
	public Flightdetails UpdateFlightdetails(Flightdetails fli) {
		Flightdetails f=em.find(Flightdetails.class,fli.getId());
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
public Flightdetails deleteById(int id) {
	Flightdetails f=em.find(Flightdetails.class,id);
	if(f!=null)
		{em.remove(f);
		}
    return f;
}

}

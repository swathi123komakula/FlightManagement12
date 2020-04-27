package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Flightschedule;
import com.capg.exceptions.IdNotFoundException;
import com.capg.service.ServiceClass;

@RestController
@RequestMapping("/flightdetailss")
@CrossOrigin("http://localhost:4200")
public class ControllerClass {
	@Autowired
	ServiceClass serviceobj;

	
	@PostMapping("/FlightscheduleCreation")
	public ResponseEntity<String> FlightdetailsCreation(@RequestBody Flightschedule fli) {
		Flightschedule f = serviceobj.FlightdetailsCreation(fli);
		if (f == null) {
			throw new IdNotFoundException("Enter Valid Id");
		} else {
			return new ResponseEntity<String>("Flight details added successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	
	@GetMapping("/GetFlightschedule/{id}")
	private ResponseEntity<Flightschedule> getFlightdetails(@PathVariable("id") int id) {
		Flightschedule f = serviceobj.getFlightdetailsById(id);
		if (f == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<Flightschedule>(f, new HttpHeaders(), HttpStatus.OK);
		}
	}

	@GetMapping("/GetAllFlightschedule")
	private ResponseEntity<List<Flightschedule>> getAllFlightdetails() {
		List<Flightschedule> flilist = serviceobj.getAllFlightdetails();
		return new ResponseEntity<List<Flightschedule>>(flilist, new HttpHeaders(), HttpStatus.OK);

	}

	
	@PutMapping("/UpdateFlightschedule")
	public ResponseEntity<String> UpdateFlight(@RequestBody Flightschedule fli) {
		Flightschedule f = serviceobj.UpdateFlightdetails(fli);
		if (f == null) {
			throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
		} else {
			return new ResponseEntity<String>("flightdetails updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	
	@DeleteMapping("/DeleteFlightschedule/{id}")
	private ResponseEntity<String> delFli(@PathVariable("id") int id) {
		Flightschedule f = serviceobj.delete(id);
		if (f == null) {
			throw new IdNotFoundException("Delete Operation Unsuccessful,Provided Id does not exist");
		} else {
			return new ResponseEntity<String>("Employee deleted successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException f) {
		return new ResponseEntity<String>(f.getMessage(), HttpStatus.NOT_FOUND);
	}
}

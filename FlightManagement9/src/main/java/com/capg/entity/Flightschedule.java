package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "Sample")
	public class Flightschedule {
	
		@Id
		private int id;
		private String model;
		private String carriername;
		private int seatcapacity;
		private String sourceairport;
		private String destinationairport;
		private DateTime arrivaltime;
		private DateTime departuretime;
		private int availableseats;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getCarriername() {
			return carriername;
		}
		public void setCarriername(String carriername) {
			this.carriername = carriername;
		}
		public int getSeatcapacity() {
			return seatcapacity;
		}
		public void setSeatcapacity(int seatcapacity) {
			this.seatcapacity = seatcapacity;
		}
		public String getSourceairport() {
			return sourceairport;
		}
		public void setSourceairport(String sourceairport) {
			this.sourceairport = sourceairport;
		}
		public String getDestinationairport() {
			return destinationairport;
		}
		public void setDestinationairport(String destinationairport) {
			this.destinationairport = destinationairport;
		}
		public DateTime getArrivaltime() {
			return arrivaltime;
		}
		public void setArrivaltime(DateTime arrivaltime) {
			this.arrivaltime = arrivaltime;
		}
		public DateTime getDeparturetime() {
			return departuretime;
		}
		public void setDeparturetime(DateTime departuretime) {
			this.departuretime = departuretime;
		}
		public int getAvailableseats() {
			return availableseats;
		}
		public void setAvailableseats(int availableseats) {
			this.availableseats = availableseats;
		}
		
	}
	
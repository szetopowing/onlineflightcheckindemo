package com.clarence.flightcheckin.integration.dto;

import java.sql.Timestamp;

public class Reservation {

	private Long id;
	private Boolean checkedIn;
	private int numberofBags;
	private Flight flight;
	private Passenger passenger;
	private Timestamp created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberofBags() {
		return numberofBags;
	}

	public void setNumberofBags(int numberofBags) {
		this.numberofBags = numberofBags;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

}

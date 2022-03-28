package com.clarence.flightcheckin.integration;

import com.clarence.flightcheckin.integration.dto.Reservation;
import com.clarence.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest);

}

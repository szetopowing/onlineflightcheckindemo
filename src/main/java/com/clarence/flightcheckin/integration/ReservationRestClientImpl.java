package com.clarence.flightcheckin.integration;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.clarence.flightcheckin.integration.dto.Reservation;
import com.clarence.flightcheckin.integration.dto.ReservationUpdateRequest;

@Service
public class ReservationRestClientImpl implements ReservationRestClient {
	
	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightreservation/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, reservationUpdateRequest, Reservation.class);
		return reservation;
	}

}

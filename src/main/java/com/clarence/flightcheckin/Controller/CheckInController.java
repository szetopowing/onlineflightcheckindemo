package com.clarence.flightcheckin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.clarence.flightcheckin.integration.ReservationRestClient;
import com.clarence.flightcheckin.integration.dto.Reservation;
import com.clarence.flightcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {
	
	@Autowired
	ReservationRestClient reservationRestClient;

	@RequestMapping("/showStartCheckin")
	public String showStartCheckin() {
		return "startCheckIn";
	}
	
	@RequestMapping("/startCheckin")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap ) {
		Reservation reservation =  reservationRestClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}
	
	@PostMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId, @RequestParam("numberOfBags") int numberOfBags, ModelMap modelMap) {
		ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		reservationUpdateRequest.setCheckedIn(true);
		reservationRestClient.updateReservation(reservationUpdateRequest);
		return "checkInConfirmation";
	}
}

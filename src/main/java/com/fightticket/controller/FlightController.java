package com.fightticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fightticket.dto.FlightBookingAcknowlegement;
import com.fightticket.dto.FlightBookingRequest;
import com.fightticket.service.PasengerService;

@RestController
@RequestMapping("/FlightBooking.com")
public class FlightController {

	@Autowired private PasengerService pasengerService;
	
	@PostMapping("/bookTicket")
	public FlightBookingAcknowlegement bookingTicket(@RequestBody FlightBookingRequest request) {
		return pasengerService.bookFlightTicket(request);
	}
}

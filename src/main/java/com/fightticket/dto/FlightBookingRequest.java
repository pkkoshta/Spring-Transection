package com.fightticket.dto;

import com.fightticket.entity.PaymentInfo;
import com.fightticket.entity.PersengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
	
	private PersengerInfo persengerInfo;
	private PaymentInfo paymentInfo;
}

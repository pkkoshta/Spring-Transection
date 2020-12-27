package com.fightticket.dto;

import com.fightticket.entity.PersengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowlegement {
	
	private String status;
	private double totalFare;
	private String pnrNo;
    private PersengerInfo passengerInfo;

}

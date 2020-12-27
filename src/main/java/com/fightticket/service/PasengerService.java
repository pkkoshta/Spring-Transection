package com.fightticket.service;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fightticket.dto.FlightBookingAcknowlegement;
import com.fightticket.dto.FlightBookingRequest;
import com.fightticket.entity.PaymentInfo;
import com.fightticket.entity.PersengerInfo;
import com.fightticket.repository.PasengerInfoRepo;
import com.fightticket.repository.PaymentInfoRepository;
import com.fightticket.utils.PaymentUtils;

@Service
public class PasengerService {
	@Autowired
	private PasengerInfoRepo pasengerInfoRepo;
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@org.springframework.transaction.annotation.Transactional
	public FlightBookingAcknowlegement bookFlightTicket(FlightBookingRequest request) {
		
		PersengerInfo persengerInfo = request.getPersengerInfo();
		persengerInfo = pasengerInfoRepo.save(persengerInfo);
		
		 PaymentInfo paymentInfo = request.getPaymentInfo();

	        PaymentUtils.validateAmount(paymentInfo.getAccountNo(), persengerInfo.getFare());

	        paymentInfo.setPassengerId(persengerInfo.getPid());
	        paymentInfo.setAmount(persengerInfo.getFare());
	        paymentInfoRepository.save(paymentInfo);
	        return new FlightBookingAcknowlegement("SUCCESS", persengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], persengerInfo);

	}

}

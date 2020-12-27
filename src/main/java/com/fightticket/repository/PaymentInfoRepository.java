package com.fightticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fightticket.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}

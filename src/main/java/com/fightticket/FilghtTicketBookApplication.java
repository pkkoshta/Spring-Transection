package com.fightticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FilghtTicketBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilghtTicketBookApplication.class, args);
	}

}

package com.betterbanking.openBanking;

import com.betterbanking.openBanking.model.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenBankingApplication.class, args);
		Transaction transaction1 = new Transaction();
		transaction1.setAccountNumber("jsjjs");
		System.out.println(transaction1.getAccountNumber());
	}

}

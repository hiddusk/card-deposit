package com.amtechie.carddeposit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class CardDepositApplication {

	@Value("${card.deposit.max.amount}")
	private String maxAmount;

	public static void main(String[] args) {
		SpringApplication.run(CardDepositApplication.class, args);
	}

	@GetMapping("/maxAmount")
	public String getMaxAmount() {
		return maxAmount;
	}
}

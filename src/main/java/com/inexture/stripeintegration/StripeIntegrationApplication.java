package com.inexture.stripeintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class StripeIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StripeIntegrationApplication.class, args);
	}

}

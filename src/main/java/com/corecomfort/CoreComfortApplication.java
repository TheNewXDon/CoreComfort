package com.corecomfort;

import com.corecomfort.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;

@SpringBootApplication
public class CoreComfortApplication {

	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {

		SpringApplication.run(CoreComfortApplication.class, args);
	}

	/*@EventListener(ApplicationReadyEvent.class)
	public void sendWelcomeEmail() {
		emailService.sendWelcomeEmail("thenewxdon@gmail.com");
	}
	 */
}

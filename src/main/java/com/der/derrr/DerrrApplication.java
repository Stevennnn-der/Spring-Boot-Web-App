package com.der.derrr;

import com.der.derrr.run.Location;
import org.slf4j.Logger;
import com.der.derrr.run.Run;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class DerrrApplication {

	private static final Logger log = LoggerFactory.getLogger(DerrrApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DerrrApplication.class, args);
//		log.info("something changed!");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS),3, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}

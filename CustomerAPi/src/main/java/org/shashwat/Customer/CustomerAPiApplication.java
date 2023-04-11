package org.shashwat.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef="auditAware")
@SpringBootApplication
public class CustomerAPiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAPiApplication.class, args);
	}

}

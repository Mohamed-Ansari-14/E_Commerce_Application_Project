package com.ecom.eCommerceWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class ECommerceWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceWebsiteApplication.class, args);
	}
}

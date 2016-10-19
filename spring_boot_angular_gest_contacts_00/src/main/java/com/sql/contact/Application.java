package com.sql.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author trungnguyen
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {
	public static void main(String... args) {
		ApplicationContext appContext = SpringApplication.run(Application.class, args);

		ContactService contactService = appContext.getBean(ContactService.class);
		System.out.println(contactService.ping());

		SpringApplication.exit(appContext);
	}
}
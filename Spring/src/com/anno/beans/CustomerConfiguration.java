package com.anno.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.anno.*")
public class CustomerConfiguration {

	@Bean(name = "customer123")
	public Customer myCustomer() {
		Customer c = new Customer();
		return c;
	}

}

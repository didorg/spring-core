package com.didorg.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.didorg.spring.core.bean.Customer;

@Configuration
public class CustomerConfiguration {
	
	@Bean
	public Customer customer() {
		return new Customer("John", "Glez");
	}

}

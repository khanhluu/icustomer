package com.icom.customer.config;

import com.icom.customer.model.Customer;
import com.icom.customer.model.CustomerRank;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Customer.class,
				CustomerRank.class);
	}

	
}

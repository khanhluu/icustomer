package com.icom.customer.repository;

import java.util.UUID;

import com.icom.customer.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Rest Repository for Customer resource
 */
@RepositoryRestResource(path = "customer", itemResourceRel = "customer", collectionResourceRel = "customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID> {

}

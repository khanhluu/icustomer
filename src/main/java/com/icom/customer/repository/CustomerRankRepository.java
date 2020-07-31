/**
 * 
 */
package com.icom.customer.repository;

import java.util.UUID;

import com.icom.customer.model.CustomerRank;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Rest Repository for rank resource
 */
@RepositoryRestResource(path = "customerRank", itemResourceRel = "customerRank", collectionResourceRel = "customerRanks")
public interface CustomerRankRepository extends PagingAndSortingRepository<CustomerRank, UUID> {

}

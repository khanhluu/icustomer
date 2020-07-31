package com.icom.customer.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icom.customer.model.ShoppingCart;

/**
 * Rest Repository for ShoppingCart resource
 */
@RepositoryRestResource(path = "shoppingCart", itemResourceRel = "shoppingCart", collectionResourceRel = "shoppingCarts")
public interface ShoppingCartRepository extends PagingAndSortingRepository<ShoppingCart, UUID> {

}

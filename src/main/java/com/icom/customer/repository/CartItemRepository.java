package com.icom.customer.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icom.customer.model.CartItem;

/**
 * Rest Repository for CartItem resource
 */
@RepositoryRestResource(path = "cartItem", itemResourceRel = "cartItem", collectionResourceRel = "cartItems")
public interface CartItemRepository extends PagingAndSortingRepository<CartItem, UUID> {

}

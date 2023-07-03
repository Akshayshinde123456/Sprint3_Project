package com.akshay.ItemsApi.repository;

import com.akshay.ItemsApi.repository.entity.Item;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface ItemRepository
    extends CrudRepository<Item, Integer>
{
}
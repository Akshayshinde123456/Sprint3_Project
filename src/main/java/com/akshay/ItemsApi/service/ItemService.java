package com.akshay.ItemsApi.service;

import com.akshay.ItemsApi.repository.entity.Item;

import java.util.List;

public interface ItemService
{

    Item save( Item item );

    void delete( int itemId );

    List<Item> all();

    Item findById( int itemId );

}
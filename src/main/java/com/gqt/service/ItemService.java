package com.gqt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gqt.Items;

@Service
public class ItemService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addItem(Items item) {
    	String query = "INSERT INTO items(item_id, item_name, item_price) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, new Object[]{
                item.getItemId(),
                item.getItemName(),
                item.getItemPrice()
        });
    }
}

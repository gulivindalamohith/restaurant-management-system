package com.example.restaurantmanagement.repository;

import com.example.restaurantmanagement.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}

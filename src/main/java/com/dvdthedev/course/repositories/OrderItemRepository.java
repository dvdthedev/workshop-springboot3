package com.dvdthedev.course.repositories;

import com.dvdthedev.course.entities.OrderItem;
import com.dvdthedev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

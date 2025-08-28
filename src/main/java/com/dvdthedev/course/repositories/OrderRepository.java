package com.dvdthedev.course.repositories;

import com.dvdthedev.course.entities.Order;
import com.dvdthedev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

package com.dvdthedev.course.repositories;

import com.dvdthedev.course.entities.Category;
import com.dvdthedev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

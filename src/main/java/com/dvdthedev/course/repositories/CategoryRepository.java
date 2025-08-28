package com.dvdthedev.course.repositories;

import com.dvdthedev.course.entities.Category;
import com.dvdthedev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

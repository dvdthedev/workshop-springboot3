package com.dvdthedev.course.repositories;

import com.dvdthedev.course.entities.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

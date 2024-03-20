package com.AjarghKreation.repository;

import com.AjarghKreation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

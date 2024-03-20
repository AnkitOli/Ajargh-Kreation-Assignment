package com.AjarghKreation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import javax.swing.text.html.parser.Entity;

public interface EntityRepository extends JpaRepository<Entity, Long> {
}


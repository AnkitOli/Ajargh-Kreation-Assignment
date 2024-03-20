package com.AjarghKreation.service;

import com.AjarghKreation.model.Admin;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface AdminService {
    Admin createEntity(Admin entity);

    Admin createEntity(Entity entity);
    List<Admin> getAllEntities();
    Admin getEntityById(Long id) throws Throwable;
    Admin updateEntity(Long id, Entity updatedEntity);
    void deleteEntity(Long id);
}

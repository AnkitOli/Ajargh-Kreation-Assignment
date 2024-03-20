package com.AjarghKreation.service;

import com.AjarghKreation.model.Admin;
import com.AjarghKreation.repository.AdminRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin createEntity(Admin entity) {
        return (Admin) adminRepository.save(entity);
    }

    @Override
    public Admin createEntity(Entity entity) {
        return null;
    }

    @Override
    public List<Admin> getAllEntities() {
        return adminRepository.findAll();
    }

    @Override
    public Admin getEntityById(Long id) throws Throwable {
        return (Admin) adminRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Admin not found with id: " + id));
    }

    @Override
    public Admin updateEntity(Long id, Entity updatedEntity) {
        return null;
    }

    @Override
    public void deleteEntity(Long id) {
        adminRepository.deleteById(id);
    }
}

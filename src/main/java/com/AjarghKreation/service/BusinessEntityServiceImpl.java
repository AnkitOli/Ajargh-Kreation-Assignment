package com.AjarghKreation.service;

import com.AjarghKreation.model.BusinessEntity;
import com.AjarghKreation.repository.BusinessEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// BusinessEntityServiceImpl.java (implementation of BusinessEntityService)
@Service
public class BusinessEntityServiceImpl implements BusinessEntityService {
    private final BusinessEntityRepository businessEntityRepository;

    public BusinessEntityServiceImpl(BusinessEntityRepository businessEntityRepository) {
        this.businessEntityRepository = businessEntityRepository;
    }

    @Override
    public BusinessEntity createBusinessEntity(BusinessEntity businessEntity) {
        return null;
    }

    @Override
    public List<BusinessEntity> getAllBusinessEntities() {
        return null;
    }

    @Override
    public BusinessEntity updateBusinessEntity(Long id, BusinessEntity updatedEntity) {
        return null;
    }

    @Override
    public void deleteBusinessEntity(Long id) {

    }

    // Implement methods from BusinessEntityService interface
}

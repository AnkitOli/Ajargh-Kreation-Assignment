package com.AjarghKreation.service;

import com.AjarghKreation.model.BusinessEntity;
import com.AjarghKreation.repository.BusinessEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// BusinessEntityService.java
public interface BusinessEntityService {
    BusinessEntity createBusinessEntity(BusinessEntity businessEntity);
    List<BusinessEntity> getAllBusinessEntities();
    BusinessEntity updateBusinessEntity(Long id, BusinessEntity updatedEntity);
    void deleteBusinessEntity(Long id);
}


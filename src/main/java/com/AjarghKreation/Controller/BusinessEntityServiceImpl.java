package com.AjarghKreation.Controller;

import com.AjarghKreation.model.BusinessEntity;
import com.AjarghKreation.repository.BusinessEntityRepository;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service("BusinessEntityService")
public class BusinessEntityServiceImpl implements BusinessEntityService {
    private final BusinessEntityRepository businessEntityRepository;
    public BusinessEntityServiceImpl(BusinessEntityRepository businessEntityRepository) {
        this.businessEntityRepository = businessEntityRepository;
    }

    @Override
    public BusinessEntity createBusinessEntity(BusinessEntity businessEntity) {
        return businessEntityRepository.save(businessEntity);
    }

    @Override
    public List<BusinessEntity> getAllBusinessEntities() {
        return businessEntityRepository.findAll();
    }

    @Override
    public BusinessEntity updateBusinessEntity(Long id, BusinessEntity updatedEntity) {
        BusinessEntity existingEntity = businessEntityRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("BusinessEntity not found with id: " + id));
        existingEntity.setName(updatedEntity.getName());

        return businessEntityRepository.save(existingEntity);
    }
}

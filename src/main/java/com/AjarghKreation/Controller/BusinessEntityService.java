package com.AjarghKreation.Controller;
import com.AjarghKreation.model.BusinessEntity;
import java.util.List;

public interface BusinessEntityService {
    BusinessEntity createBusinessEntity(BusinessEntity businessEntity);
    List<BusinessEntity> getAllBusinessEntities();
    BusinessEntity updateBusinessEntity(Long id, BusinessEntity updatedEntity);
}


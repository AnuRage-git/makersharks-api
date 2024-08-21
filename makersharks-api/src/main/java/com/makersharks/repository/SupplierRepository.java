package com.makersharks.repository;

import com.makersharks.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location, 
            String natureOfBusiness, 
            String manufacturingProcess, 
            Pageable pageable);
}

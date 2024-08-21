package com.makersharks.dto;

import com.makersharks.model.Supplier;
import java.util.List;

public class SupplierResponse {
    private List<Supplier> suppliers;
    private int totalElements;
    private int totalPages;

    // Constructor
    public SupplierResponse(List<Supplier> suppliers, int totalElements, int totalPages) {
        this.suppliers = suppliers;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
    }

    // Getters and Setters
    public List<Supplier> getSuppliers() { return suppliers; }
    public void setSuppliers(List<Supplier> suppliers) { this.suppliers = suppliers; }
    public int getTotalElements() { return totalElements; }
    public void setTotalElements(int totalElements) { this.totalElements = totalElements; }
    public int getTotalPages() { return totalPages; }
    public void setTotalPages(int totalPages) { this.totalPages = totalPages; }
}

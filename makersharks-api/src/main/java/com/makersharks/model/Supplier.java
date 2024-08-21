package com.makersharks.model;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Supplier {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String supplierId;

        @NotEmpty(message = "Company name is required")
        private String companyName;

        private String website;

        @NotEmpty(message = "Location is required")
        private String location;

        @NotEmpty(message = "Nature of business is required")
        @Size(max = 20, message = "Nature of business must be 20 characters or less")
        private String natureOfBusiness;

        @ElementCollection
            @NotNull(message = "At least one manufacturing process is required")
            private List<String> manufacturingProcesses;

         public Supplier( String supplierId, String companyName, String website, String location, String natureOfBusiness, List<String> manufacturingProcesses) {
                this.supplierId = supplierId;
                this.companyName = companyName;
                this.website = website;
                this.location = location;
                this.natureOfBusiness = natureOfBusiness;
                this.manufacturingProcesses = manufacturingProcesses;
                }

    // Getters and setters
    public String getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(String supplierId) {
            this.supplierId = supplierId;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getNatureOfBusiness() {
            return natureOfBusiness;
        }

        public void setNatureOfBusiness(String natureOfBusiness) {
            this.natureOfBusiness = natureOfBusiness;
        }

        public List<String> getManufacturingProcesses() {
            return manufacturingProcesses;
        }

        public void setManufacturingProcesses(List<String> manufacturingProcesses) {
            this.manufacturingProcesses = manufacturingProcesses;
        }
}


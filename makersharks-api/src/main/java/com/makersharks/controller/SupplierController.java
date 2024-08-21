package com.makersharks.controller;

import com.makersharks.dto.ApiResponse;
import com.makersharks.model.Supplier;
import com.makersharks.service.SupplierService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
@Tag(name = "Supplier Management", description = "Operations related to suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    @Operation(
        summary = "Retrieve a list of suppliers based on criteria",
        description = "Provide location, nature of business, and manufacturing process to retrieve matching suppliers.",
        parameters = {
            @Parameter(name = "location", description = "Location of the supplier", example = "India", required = true),
            @Parameter(name = "natureOfBusiness", description = "Nature of the business", example = "small_scale", required = true),
            @Parameter(name = "manufacturingProcess", description = "Manufacturing process", example = "3d_printing", required = true)
        }
    )
    public ApiResponse<List<Supplier>> querySuppliers(
            @RequestParam
            String location,

            @RequestParam
            String natureOfBusiness,

            @RequestParam
            String manufacturingProcess) {

        List<Supplier> suppliers = supplierService.querySuppliers(location, natureOfBusiness, manufacturingProcess);

        return new ApiResponse<>(true, "Suppliers retrieved successfully", suppliers);
    }
}

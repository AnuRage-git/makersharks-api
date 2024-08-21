package com.makersharks.controller;

import com.makersharks.dto.ApiResponse;
import com.makersharks.model.Supplier;
import com.makersharks.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ApiResponse<List<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcess) {
        

        List<Supplier> suppliers = supplierService.querySuppliers(location, natureOfBusiness, manufacturingProcess);

        return new ApiResponse<>(
            true,
            "Suppliers retrieved successfully",
            suppliers
        );
    }
}

package com.makersharks.service;

import com.makersharks.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierService {

    private final List<Supplier> suppliers = new ArrayList<>(Arrays.asList(
        new Supplier("SUP001", "Alpha Manufacturing", "http://alpha.com", "India", "small_scale", Arrays.asList("3d_printing", "coating")),
        new Supplier("SUP002", "Beta Industries", "http://beta.com", "India", "medium_scale", Arrays.asList("casting", "moulding")),
        new Supplier("SUP003", "Gamma Tech", "http://gamma.com", "USA", "large_scale", Arrays.asList("3d_printing", "moulding")),
        new Supplier("SUP004", "Delta Corp", "http://delta.com", "India", "small_scale", Arrays.asList("casting", "coating")),
        new Supplier("SUP005", "Epsilon Works", "http://epsilon.com", "Germany", "medium_scale", Arrays.asList("3d_printing", "casting"))
    ));

    public List<Supplier> querySuppliers(String location, String natureOfBusiness, String manufacturingProcess) {
        return suppliers.stream()
            .filter(supplier -> supplier.getLocation().equalsIgnoreCase(location))
            .filter(supplier -> supplier.getNatureOfBusiness().equalsIgnoreCase(natureOfBusiness))
            .filter(supplier -> supplier.getManufacturingProcesses().contains(manufacturingProcess))
            .collect(Collectors.toList());
    }
}

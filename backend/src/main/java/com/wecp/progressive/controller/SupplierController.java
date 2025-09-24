package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;
import com.wecp.progressive.service.impl.SupplierServiceImplArraylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/supplier")
public class SupplierController {
    SupplierServiceImplArraylist supplierServiceImplArraylist;
    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers()  {
        return new ResponseEntity<>(supplierServiceImplArraylist.getAllSuppliers(),HttpStatus.OK);
    }

    public ResponseEntity<Supplier> getSupplierById(int supplierId) {
        return null;
    }

    public ResponseEntity<Integer> addSupplier(Supplier supplier) {
       supplierServiceImplArraylist.addSupplier(supplier);
        return null;
    }

    public ResponseEntity<Void> updateSupplier(Supplier supplier) {
        return null;
    }

    public ResponseEntity<Void> deleteSupplier(int supplierId) {
        return null;
    }
    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Supplier>> getAllSuppliersFromArrayList() {
        return new ResponseEntity<>(supplierServiceImplArraylist.getAllSuppliers(),HttpStatus.OK);
    }
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addSupplierToArrayList(Supplier supplier) {
        return new ResponseEntity<>(supplierServiceImplArraylist.addSupplier(supplier),HttpStatus.CREATED);
    }
    @GetMapping("/fromArrayList/all")
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() {
        return new ResponseEntity<>(supplierServiceImplArraylist.getAllSuppliersSortedByName(),HttpStatus.OK);
    }
}

package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJpa  implements SupplierService{

    @Override
    public int addSupplier(Supplier supplier)  {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliers()  {
        return List.of();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName()  {
        return List.of();
    }
    public void updateSupplier(Supplier supplier)
    {

    }
    public void deleteSupplier(int supplierId)
    {
        
    }
    public Supplier getSupplierById(Supplier supplier) {
       return null;
    }

}

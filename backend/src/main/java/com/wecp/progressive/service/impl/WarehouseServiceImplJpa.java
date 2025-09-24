package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJpa  implements WarehouseService{

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deleteWarehouse(int warehouseId)  {
       
    }

    @Override
    public List<Warehouse> getAllWarehouses()  {
        
        return List.of();
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId)  {
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
       return List.of();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
        return List.of();
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
        
    }

}

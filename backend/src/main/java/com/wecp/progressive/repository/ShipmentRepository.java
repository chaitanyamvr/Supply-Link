package com.wecp.progressive.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.wecp.progressive.entity.Shipment;
 
public interface ShipmentRepository extends JpaRepository<Shipment,Integer>{
    Shipment findByShipmentId(int shipmentID);
//     public void deleteByWarehouseId(int warehouseId);
//     public void deleteByProductId(int productId);
//     public void deleteBySupplierId(int supplierId);
}
 

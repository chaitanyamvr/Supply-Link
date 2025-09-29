package com.wecp.progressive.service.impl;
 
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wecp.progressive.entity.Shipment;
import com.wecp.progressive.repository.ShipmentRepository;
import com.wecp.progressive.service.ShipmentService;
 
@Service
public class ShipmentServiceImpl implements ShipmentService{
    @Autowired
    ShipmentRepository shipmentRepository;
 
    @Override
    public List<Shipment> getAllShipments()  {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllShipments'");
        return shipmentRepository.findAll();
    }
 
    @Override
    public Shipment getShipmentById(int shipmentId) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getShipmentById'");
        // if(shipmentRepository.existsById(shipmentId)){
        //     throw new SQLException("Not found");
        // }
        return shipmentRepository.findByShipmentId(shipmentId);
    }
 
    @Override
    public int addShipment(Shipment shipment)  {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addShipment'");
        shipmentRepository.save(shipment);
        return shipment.getShipmentId();
    }
 
    @Override
    public void updateShipment(Shipment shipment) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateShipment'");
       // shipmentRepository.save(shipment);
    }
 
    @Override
    public void deleteShipment(int shipmentId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteShipment'");
        //shipmentRepository.deleteBySupplierId(shipmentId);
    }
 
}

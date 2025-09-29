package com.wecp.progressive.controller;
 
import com.wecp.progressive.entity.Shipment;
import com.wecp.progressive.service.ShipmentService;
import com.wecp.progressive.service.impl.ShipmentServiceImpl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
import java.sql.SQLException;
import java.util.List;
@RestController
public class ShipmentController {
    @Autowired
    ShipmentServiceImpl shipmentServiceImpl;
    @GetMapping("/shipment")
    public ResponseEntity<List<Shipment>> getAllShipments() {
        return new ResponseEntity<>(shipmentServiceImpl.getAllShipments(),HttpStatus.OK);
    }
    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<Shipment> getShipmentById(@PathVariable int shipmentId)  {
        try{
        //return new ResponseEntity<>(shipmentServiceImpl.getShipmentById(shipmentId),HttpStatus.OK);
        Shipment s=shipmentServiceImpl.getShipmentById(shipmentId);
        if(s==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(s,HttpStatus.OK);
        }catch(SQLException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
 
    }
    @PostMapping("/shipment")
    public ResponseEntity<Integer> addShipment(@RequestBody Shipment shipment) throws SQLException {
        return new ResponseEntity<>(shipmentServiceImpl.addShipment(shipment),HttpStatus.CREATED);
    }
    @PutMapping("/shipment/{shipmentId}")
    public ResponseEntity<Void> updateShipment(@PathVariable int shipmentId, @RequestBody Shipment shipment)  {
        // shipmentService.updateShipment(shipment);
        // return new ResponseEntity<>(HttpStatus.OK);
        return null;
    }
    @DeleteMapping("/shipment/{shipmentId}")
    public ResponseEntity<Void> deleteShipment(@PathVariable int shipmentId) {
        // shipmentService.deleteShipment(shipmentId);
        // return new ResponseEntity<>(HttpStatus.valueOf(204));
        return null;
    }
}

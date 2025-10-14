import { Component } from '@angular/core';

@Component({
  selector: 'app-warehousesample',
  standalone: true,
  imports: [],
  templateUrl: './warehousesample.component.html',
  styleUrls: ['./warehousesample.component.css']
})
export class WarehouseSampleComponent {
 warehouse = {
  warehouseId : 101,
  supplierId : "1",
  warehouseName : "pattangere",
  location : "rr nagar",
  capacity: 50
 }
}

import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Supplier } from '../../types/Supplier';
import { of } from 'rxjs';

@Component({
  selector: 'app-suppliersample',
  standalone: true,
  imports: [], // Add necessary imports
  templateUrl: './suppliersample.component.html',
  styleUrls: ['./suppliersample.component.css'] 
})
export class SupplierSampleComponent {
  // Component logic goes here
  supplier = {
    supplierId:1,
    supplierName : "John",
    email: "john@gmail.com",
    phone : "9494949494",
    address : "3rd street bangalore",
    username : "john123",
    password : "john@12",
    role : 'maintenance'
  };
}
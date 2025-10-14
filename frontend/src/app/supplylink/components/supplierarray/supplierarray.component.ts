import { Component } from '@angular/core';
import { Supplier } from '../../types/Supplier';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-supplierrarray',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './supplierarray.component.html',
  styleUrls: ['./supplierarray.component.css']
})
export class SupplierArrayComponent {
  supplierList : Supplier[] = [
    {supplierId: 1, supplierName: "Jessica", email: "July@12221", phone: "7368289682", address: "california", username: "jessica", password: "July@12221", role: "USER"},
    {supplierId: 2, supplierName: "John Wane", email: "johnwane@gmail.com", phone: "7368289682", address: "california", username: "john01", password: "john@12", role: "manager"},
    {supplierId: 3, supplierName: "Kristan", email: "kristan@gmail.com", phone: "7368289682", address: "california", username: "kristan01", password: "kristan@12", role: "supervisor"}
  ]
}

import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector: 'app-warehouse',
    templateUrl: './warehouse.component.html'
 })

export class WarehouseComponent implements OnInit{
warehouseForm!: FormGroup;
  
constructor(private fb: FormBuilder){}
ngOnInit(): void {
    this.warehouseForm = this.fb.group({
      //warehouseId:[null],
      supplierId: ['', Validators.required],
      warehouseName: ['', Validators.required],
      location: [''],
      capacity: ['', [Validators.required, Validators.min(0)]],
      //email: ['', [Validators.required, Validators.email]]
    });
  }

onSubmit(): void{
    if (this.warehouseForm.valid) {
        const warehouseData = this.warehouseForm.value;
        console.log('Warehouse Data:', warehouseData);
        console.log('Form Valid:',this.warehouseForm.valid);
        
}


}
}

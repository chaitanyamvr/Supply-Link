import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector:'app-product',
    standalone: true,
    imports: [],
    templateUrl: './product.component.html',
    styleUrls: ['./product.component.scss']
  })
export class ProductComponent implements OnInit{

    productForm:FormGroup;
    constructor(private fb:FormBuilder){}
    ngOnInit(): void {
    this.productForm=this.fb.group({
        productId:['',],
        warehouseId:['',[Validators.required,Validators.min(1)]],
        productName:['',Validators.required],
        productDescription:[''],
        quantity:['',[Validators.required,Validators.min(0)]],
        price:['',[Validators.required,Validators.min(1)]]
    });
    }
    onSubmit()
    {

    }
 
}

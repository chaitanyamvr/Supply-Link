import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
@Component({
    selector: 'app-product',
    templateUrl: './product.component.html'
})
export class ProductComponent implements OnInit{
 productForm!: FormGroup;

 constructor(private fb: FormBuilder){}

 ngOnInit(): void {
     this.productForm = this.fb.group({
        productId: [''],
        warehouseId:['',[Validators.required,Validators.min(1)]],
        productName:['',[Validators.required]],
        productDescription: [''],
        quantity: ['',Validators.required,Validators.min(0)],
        price:['',[Validators.required,Validators.min(0.01)]]
     });
 }

 onSubmit(): void{
    if(this.productForm.valid){

        const product = {
            productId:this.productForm.value.prooductId,
            warehouseId:this.productForm.value.warehouseId,
            productName:this.productForm.value.productName,
            productDescription:this.productForm.value.productDescription,
            quantity:this.productForm.value.quantity,
            price:this.productForm.value.price,
        };
        console.log('Product created:', product);

        
        console.log('Product Submitted:', product);

    }
 }

}

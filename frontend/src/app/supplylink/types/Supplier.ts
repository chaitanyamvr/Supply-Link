export class Supplier {
  supplierId : number;
  supplierName : string;
  email : string;
  phone : string;
  address : string;
  username : string;
  password : string;
  role: string;

  constructor(supplierId : number,supplierName : string,email : string,phone : string,address : string,username : string,password : string,role: string){
    this.supplierId = supplierId;
    this.supplierName = supplierName;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.username = username;
    this.password = password;
    this.role = role;
  }

<<<<<<< HEAD
  // displayInfo():void{
  //   console.log(`Supplier ID:${this.supplierId}`);
  //   console.log(`Supplier name:${this.supplierName}`);
  //   console.log(`email:${this.email}`);
  // }
=======
  displayInfo():void{
    console.log(`Supplier ID:${this.supplierId}`);
    console.log(`Supplier name:${this.supplierName}`);
    console.log(`email:${this.email}`);
  }
>>>>>>> 7ab27733c82d2ae2ed7eef00b173f27aaaf6fec9
   
}






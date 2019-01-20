import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { CustomerServiceService } from '../service/customer-service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
 
  views: any = {nametInput: "",
  addressInput: "",
  emailInput: "",
  phoneInput: "",
  provinceInput: "",
  districtInput: "",
  cantonInput: "",
  titlenameId: "",
  typeworkingSelect:"",
 typeworkingDateSelect: ""
  };


  constructor(private customerService: CustomerServiceService , private httpClient: HttpClient) { }

  ngOnInit() {
    this.customerService.getTitlenameType().subscribe(data=>{
      console.log(data)
      this.titlenameType = data;
    })

    this.customerService.getTypeworking().subscribe(data=>{
      console.log(data)
      this.typeworking = data;
    })

    this.customerService.getTypeworkingDate().subscribe(data=>{
      console.log(data)
      this.typeworkingDate = data;
    })

  }

  titlenameType: Array<any>= [];
  titlenameTypes: any = {
    titlenameType:null
  };

  typeworking: Array<any>= [];
  typeworkings: any = {
    typeworking:null
  };

  typeworkingDate: Array<any>= [];
  typeworkingDates: any = {
    typeworkingDate:null
  };

  save_func(){
    console.log(this.views)
    this.customerService.saveRegi(this.views).subscribe(data=>{
      console.log(data)
      this.views ={nametInput: "",
        addressInput: "",
        emailInput: "",
        phoneInput: "",
        provinceInput: "",
        districtInput: "",
        cantonInput: "",
        titlenameId: "",
        typeworkingSelect:"",
       typeworkingDateSelect: ""
        
      };
      alert("บันทึกสำเสร็จ");

    })
            
  }
}
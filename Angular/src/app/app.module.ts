

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginAddminComponent } from './login-addmin/login-addmin.component';
import { AdminService } from './service/admin.service';
import { MainAdminComponent } from './main-admin/main-admin.component';
import { ContractComponent } from './contract/contract.component';

import { HttpClientModule } from '@angular/common/http';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule, MatTableModule,
MatSidenavModule, MatCheckboxModule } from '@angular/material';
import {MatIconModule} from '@angular/material/icon';
import {MatSelectModule} from '@angular/material/select';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatGridListModule} from '@angular/material/grid-list';
import { MatNativeDateModule} from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import {MatRadioModule} from '@angular/material/radio';
import { CustomerServiceService } from './service/customer-service.service';
import { RegisterComponent } from './register/register.component';
import { ReactiveFormsModule } from '@angular/forms';
import { EditContractComponent } from './edit-contract/edit-contract.component';
import { CustomerComponent } from './customer/customer.component';
import { PaymentComponent } from './payment/payment.component';
import { PaymentService } from './service/payment.service';
import {MatFormFieldModule} from '@angular/material/form-field';

@NgModule({
  declarations: [
    AppComponent,
    LoginAddminComponent,
    MainAdminComponent,
    ContractComponent,
    RegisterComponent,
    EditContractComponent,
    CustomerComponent,
    PaymentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    FormsModule,
    MatTableModule,
    MatCheckboxModule,
    MatSidenavModule,
    MatIconModule,
    MatGridListModule,
    MatRadioModule,
    ReactiveFormsModule,
    MatFormFieldModule
  ],
  providers: [AdminService, CustomerServiceService, PaymentService],
  bootstrap: [AppComponent]
})
export class AppModule { }

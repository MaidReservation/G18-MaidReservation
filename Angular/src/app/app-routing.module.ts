import { PaymentComponent } from './payment/payment.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginAddminComponent } from './login-addmin/login-addmin.component';
import { MainAdminComponent } from './main-admin/main-admin.component';
import { ContractComponent } from './contract/contract.component';
import { RegisterComponent } from './register/register.component';
import { EditContractComponent } from './edit-contract/edit-contract.component';
import { CustomerComponent } from './customer/customer.component';
const routes: Routes = [
  {path: '' , component: LoginAddminComponent},
  {path: 'mainAdmin' , component: MainAdminComponent},
  {path: 'contract' , component: ContractComponent},
  {path: 'editcontract' , component: EditContractComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'customer', component: CustomerComponent},
  {path: 'payment' , component: PaymentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

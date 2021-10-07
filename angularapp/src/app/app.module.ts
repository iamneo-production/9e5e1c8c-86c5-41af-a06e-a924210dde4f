import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FlexLayoutModule } from '@angular/flex-layout';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSelectModule} from '@angular/material/select';
import {MatIconModule} from '@angular/material/icon';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './user/home/home.component';
import { AddIssueComponent } from './user/add-issue/add-issue.component';
import { ManageUsersComponent } from './admin/manage-users/manage-users.component';
import { AdminHomeComponent } from './admin/admin-home/admin-home.component';
//import { EmployeeHomeComponent } from './employee/employee-home/employee-home.component';
import { FormsModule } from '@angular/forms';
import { SolvedIssueComponent } from './user/solved-issue/solved-issue.component';
//import { EditStatusComponent } from './employee/edit-status/edit-status.component';
//import { EmployeeSolvedIssueComponent } from './employee/employee-solved-issue/solved-issue.component';
import { AdminSolvedIssueComponent } from './admin/admin-solved-issue/admin-solved-issue.component';
import { EditStatusComponent } from './admin/edit-status/edit-status.component';
import { AddEmployeeComponent } from './admin/add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './admin/update-employee/update-employee.component';
//import { ForgotPasswordEmailAuthComponent } from './forgot-password-email-auth/forgot-password-email-auth.component';
//import { ForgotPasswordResetComponent } from './forgot-password-reset/forgot-password-reset.component';
import { EditIssueComponent } from './user/edit-issue/edit-issue.component';
import { ActiveIssueComponent } from './admin/active-issue/active-issue.component';
//import { UpdateEmployeeComponent } from './admin/update-employee/update-employee.component';
//import { AddEmployeeComponent } from './admin/add-employee/add-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    AddIssueComponent,
    ManageUsersComponent,
    AdminHomeComponent,
    //EmployeeHomeComponent,
    //EmployeeSolvedIssueComponent,
    SolvedIssueComponent,
    //EditStatusComponent,
    AdminSolvedIssueComponent,
    EditStatusComponent,
    AddEmployeeComponent,
    UpdateEmployeeComponent,
    //ForgotPasswordEmailAuthComponent,
    //ForgotPasswordResetComponent,
    EditIssueComponent,
    ActiveIssueComponent,
    ActiveIssueComponent,
    UpdateEmployeeComponent,
    AddEmployeeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FlexLayoutModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    MatToolbarModule,
    MatSelectModule,
    MatIconModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
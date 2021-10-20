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
import { FormsModule } from '@angular/forms';
import { SolvedIssueComponent } from './user/solved-issue/solved-issue.component';
import { AdminSolvedIssueComponent } from './admin/admin-solved-issue/admin-solved-issue.component';
import { EditIssueComponent } from './user/edit-issue/edit-issue.component';
import { AdminActiveIssueComponent } from './admin/admin-active-issue/admin-active-issue.component';
import { AdminEditStatusComponent } from './admin/admin-edit-status/admin-edit-status.component';
import { AdminAddEmployeeComponent } from './admin/admin-add-employee/admin-add-employee.component';
import { AdminManageUsersByIdComponent } from './admin/admin-manage-users-by-id/admin-manage-users-by-id.component';
import { AdminUpdateEmployeeComponent } from './admin/admin-update-employee/admin-update-employee.component';
import { AssignDeveloperByIdComponent } from './admin/assign-developer-by-id/assign-developer-by-id.component';
import { EditStatusComponent } from './employee/edit-status/edit-status.component';
import { EditStatusByIdComponent } from './employee/edit-status-by-id/edit-status-by-id.component';
import { EmployeeHomeComponent } from './employee/employee-home/employee-home.component';
import { EmployeeSolvedIssueComponent } from './employee/employee-solved-issue/employee-solved-issue.component';
import { EditIssueByIdComponent } from './user/edit-issue-by-id/edit-issue-by-id.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    AddIssueComponent,
    ManageUsersComponent,
    AdminHomeComponent,
    SolvedIssueComponent,
    AdminSolvedIssueComponent,
    EditIssueComponent,
    AdminActiveIssueComponent,
    AdminEditStatusComponent,
    AdminAddEmployeeComponent,
    AdminManageUsersByIdComponent,
    AdminUpdateEmployeeComponent,
    AssignDeveloperByIdComponent,
    EditStatusComponent,
    EditStatusByIdComponent,
    EmployeeHomeComponent,
    EmployeeSolvedIssueComponent,
    EditIssueByIdComponent,
    
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
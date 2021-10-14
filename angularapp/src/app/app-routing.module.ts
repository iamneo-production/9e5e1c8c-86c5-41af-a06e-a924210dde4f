import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './user/home/home.component';
import { AddIssueComponent } from './user/add-issue/add-issue.component';
import { ManageUsersComponent } from './admin/manage-users/manage-users.component';
import { AdminHomeComponent } from './admin/admin-home/admin-home.component';
import {AdminSolvedIssueComponent } from './admin/admin-solved-issue/admin-solved-issue.component';
import { SolvedIssueComponent } from './user/solved-issue/solved-issue.component';
import { AdminActiveIssueComponent } from './admin/admin-active-issue/admin-active-issue.component';


const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'userhome',component:HomeComponent},
  {path:'useraddissue',component:AddIssueComponent},
  {path:'usersolvedissue',component:SolvedIssueComponent},
  {path:'adminmanageusers',component:ManageUsersComponent},
  {path:'adminhome',component:AdminHomeComponent},
  {path:'adminsolvedissue',component:AdminSolvedIssueComponent},
  {path:'adminactiveissue',component:AdminActiveIssueComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
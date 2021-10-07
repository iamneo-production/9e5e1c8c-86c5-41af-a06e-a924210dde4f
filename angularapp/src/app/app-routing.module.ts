import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './user/home/home.component';
import { AddIssueComponent } from './user/add-issue/add-issue.component';
import { SolvedIssueComponent } from './user/solved-issue/solved-issue.component';


const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'userhome',component:HomeComponent},
  {path:'useraddissue',component:AddIssueComponent},
  {path:'usersolvedissue',component:SolvedIssueComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

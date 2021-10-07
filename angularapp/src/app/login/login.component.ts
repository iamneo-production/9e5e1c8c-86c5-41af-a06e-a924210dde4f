import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  constructor(private router: Router) { }
  ngOnInit(): void {
  }
  hide = true;

  onClickSubmit(data: { role: string; }) {
    if(data.role == 'Customer')
    this.router.navigate(['/userhome']);
    if(data.role == 'Employee')
    this.router.navigate(['/employeehome']);
    if(data.role == 'Admin')
    this.router.navigate(['/adminhome']);
    }
    
}
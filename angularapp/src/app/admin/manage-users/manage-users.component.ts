import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-manage-users',
  templateUrl: './manage-users.component.html',
  styleUrls: ['./manage-users.component.css']
})
export class ManageUsersComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  hide = true;
  display = false;
  addEmployee(){
    this.display = !this.display;
  }
  display1=false;
  updateEmployee()
  {
    this.display1 = !this.display1;
  }
}

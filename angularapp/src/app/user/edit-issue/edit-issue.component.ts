import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-edit-issue',
  templateUrl: './edit-issue.component.html',
  styleUrls: ['./edit-issue.component.css']
})
export class EditIssueComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  imgURL:string | ArrayBuffer ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKFSgdhQvBlZO6I8s-jtKIYOED1NqEs4xEjA&usqp=CAU";
  preview(value: any)
  {
    this.imgURL=value;
  }

}

import { Component } from '@angular/core';

@Component({
  selector: 'app1-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {


  emp={
    "id":"E001",
    "name":"Praveen",
    "age":87,
    "phno":['99988','848488','04074747']
  }

  employee:{
    "id":88333,
    "name":"Praveen",
    "project":{
      "pid":8478458,
      "pname":"Ford",
      "loc":"Hyderabad"
      "skiils":["java","Angular"];
    }
  }

  emps=[
    {"id":87,"name":'Praveen'},
    {"id":54,"name":'James'},
    {"id":12,"name":'Ruth'},
    {"id":82,"name":'Bag'},
    {"id":83,"name":'Wall'},

  ];


}

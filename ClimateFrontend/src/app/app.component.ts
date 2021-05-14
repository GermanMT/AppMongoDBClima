import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ClimateFrontend';
  x = 'home';

  constructor(private router: Router, private location: Location) { }

  // tslint:disable-next-line: typedef
  Listar(){
    this.router.navigate(['listar']);
    this.x = 'no_home';
  }

  // tslint:disable-next-line: typedef
  Home() {
    this.router.navigate(['']).then(() => {
      window.location.reload();
    });
  }
}

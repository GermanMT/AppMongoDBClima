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
  x = 'mostrar';

  constructor(private router: Router, private location: Location) { }

  // tslint:disable-next-line: typedef
  Listar(){
    this.router.navigate(['listar']);
    this.x = 'ocultar';
  }

  // tslint:disable-next-line: typedef
  Show(){
    this.router.navigate(['show']);
    this.x = 'ocultar';
  }

  // tslint:disable-next-line: typedef
  Home() {
    this.router.navigate(['']).then(() => {
      window.location.reload();
    });
  }
}

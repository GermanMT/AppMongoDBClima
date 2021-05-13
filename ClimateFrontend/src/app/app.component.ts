import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ClimateFrontend';
  home = 'home';

  constructor(private router: Router) { }

  // tslint:disable-next-line: typedef
  Listar(){
    this.router.navigate(['listar']);
  }

  // tslint:disable-next-line: typedef
  Show(){
    this.router.navigate(['show']);
  }
}

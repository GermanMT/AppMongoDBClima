import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Result } from 'src/app/models/Result';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  results!: Result[];
  constructor(private service: ServiceService, private router: Router) { }

  // tslint:disable-next-line: typedef
  ngOnInit() {
    this.service.getResults()
      .subscribe(data => {
        this.results = data;
      });
  }

}

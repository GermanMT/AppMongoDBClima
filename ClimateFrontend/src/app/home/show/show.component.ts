import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Result } from 'src/app/models/Result';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {

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

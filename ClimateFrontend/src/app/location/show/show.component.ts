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

  code!: any;
  result!: Result;
  constructor(private service: ServiceService, private router: Router ) { }

  // tslint:disable-next-line: typedef
  ngOnInit() {
    const urlParams = new URLSearchParams(window.location.search);
    const myParam = urlParams.get('code');
    this.code = myParam;
    this.service.getResultsByProvince(this.code)
      .subscribe(data => {
        this.result = data;
      });
  }

}

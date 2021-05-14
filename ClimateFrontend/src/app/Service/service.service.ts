import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Result } from 'src/app/models/Result';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  urlHome = 'http://localhost:9000/home/populateHome';
  urlLocation = 'http://localhost:9000/provinces/getByProvince';

  // tslint:disable-next-line: typedef
  getResults() {
    return this.http.get<Result[]>(this.urlHome);
  }

  // tslint:disable-next-line: typedef
  getResultsByProvince(code: string) {
    return this.http.get<Result>(this.urlLocation + '/' + code);
  }
}

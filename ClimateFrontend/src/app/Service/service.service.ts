import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Result } from 'src/app/models/Result';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  url = 'http://localhost:9000/home/populateHome';

  // tslint:disable-next-line: typedef
  getResults() {
    return this.http.get<Result[]>(this.url);
  }
}

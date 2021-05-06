import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Info } from '../models/Info';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  url = 'http://localhost:9000/';

  getInfo(){
    return this.http.get<Info[]>(this.url);
  }
}

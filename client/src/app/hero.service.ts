import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/internal/Observable';

@Injectable()
export class HeroService {
  public API = 'http://localhost:8080';
  constructor(private http: HttpClient) { }

  getCars(): Observable<any> {
    return this.http.get(this.API + '/cars');
  }
}

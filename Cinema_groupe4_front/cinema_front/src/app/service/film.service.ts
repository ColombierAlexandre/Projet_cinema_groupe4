import { Injectable } from '@angular/core';
import { Film } from '../model/film';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  private film : Film | undefined;

  private _url : string = 'http://localhost:9091/film_api';

  constructor(private httpClient : HttpClient) { }

  getAllFilm() : Observable<Film[]> {
    return this.httpClient.get<Film[]>(this._url);
  }
  getOne(visa : number) : Observable<Film> {
    return this.httpClient.get<Film>(this._url + "/" + visa);
  }

}

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

  getFilmBoById(visa : number) : Observable<Film> {
    return this.httpClient.get<Film>(this._url + "/" + visa);
  }

  getFilmBoByName(name : string) : Observable<Film> {
    return this.httpClient.get<Film>(this._url + "/titre/" + name);
  }

  getAllFilm() : Observable<Film[]> {
    return this.httpClient.get<Film[]>(this._url);
  }

  getFilmByProg(id : number) : Observable<Film>{
    return this.httpClient.get<Film>(this._url);
  }
  
  
}

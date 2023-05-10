import { Injectable } from '@angular/core';
import { Programmation } from '../model/programmation';
import { Place } from '../model/place';
import {Film} from "../model/film";
import {Salle} from "../model/salle";
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ProgrammationService {


  private prog : Programmation | undefined;
  private _url : string = 'http://localhost:9091/programmationbo_api';

  constructor(private httpClient : HttpClient) {}

  getProgrammationId(idProgrammation : number) : Observable<Programmation>{
    return this.httpClient.get<Programmation>(this._url + "/" +idProgrammation);
  }

  getAllProgrammation(idProgrammation : number) : Observable<Programmation>{
    return this.httpClient.get<Programmation>(this._url + "/getAll");
  }

}

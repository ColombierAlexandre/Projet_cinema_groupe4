import { Injectable } from '@angular/core';
import { Utilisateur } from '../model/utilisateur';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  private utilisateur : Utilisateur | undefined

  private _url : string = 'http://localhost:9091/utilisateur_api';

  constructor(private httpClient : HttpClient) { }

  getUtilisateurByEmail(email : string) : Observable<Utilisateur> {
    return this.httpClient.get<Utilisateur>(this._url + "/getByEmail/" + email)
  }


}

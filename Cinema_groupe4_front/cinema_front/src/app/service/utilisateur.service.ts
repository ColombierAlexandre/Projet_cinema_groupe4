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

  getAllUtilisateurs() : Observable<Utilisateur[]> {
    return this.httpClient.get<Utilisateur[]>(this._url);
  }

  addUtilisateur(utilisateur : Utilisateur) : Observable<Utilisateur>{
    return this.httpClient.post<Utilisateur>(this._url,utilisateur);
  }

  updateUtilisateur(utilisateur : Utilisateur) : Observable<Utilisateur>{
    return this.httpClient.put<Utilisateur>(this._url,utilisateur);
  }

  deleteUtilisateur(utilisateur : Utilisateur) : Observable<Utilisateur>{
    //return this.httpClient.delete<PokemonInterface>(this._url + "/" + pokemon.id);
    console.log(utilisateur);
    return this.httpClient.delete<Utilisateur>(`${this._url}/${utilisateur.idUtilisateur}`);
  }

  getUtilisateurById(id : number) : Observable<Utilisateur> {
    return this.httpClient.get<Utilisateur>(this._url + "/" + id);
  }

}

import {Film} from "./film";
import {Salle} from "./salle";
import {Place} from "./place";

export class Programmation{
    private _id : number;
    private _date : Date;
    private _film : Film;
    private _salle : Salle;
    private _places : Place[];

    get id() : number {
        return this._id;
    }

    set id(value : number) {
        this._id = value;
    }
    
    get date() : Date {
        return this._date;
    }

    set date(value : Date) {
        this._date = value;
    }

    get film() : Film {
        return this._film;
    }

    set film(value : Film) {
        this._film = value;
    }

    get salle() : Salle {
        return this._salle;
    }

    set salle(value : Salle) {
        this._salle = value;
    }

    get places() : Place[] {
        return this._places;
    }

    set places(value : Place[]) {
        this._places = value;
    }

    constructor(id : number, date : Date, film : Film, salle : Salle, places : Place[]){
        this._id = id;
        this._date = date;
        this._film = film;
        this._salle = salle;
        this._places = places;
    }



}
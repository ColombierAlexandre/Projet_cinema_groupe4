export class Salle{

    private _idSalle : number;
    private _numero : number;
    private _nombrePlace : number;

    get idSalle() : number {
        return this._idSalle;
    }

    set idSalle(value : number) {
        this._idSalle = value;
    }

    get numero() : number {
        return this._numero;
    }

    set numero(value : number) {
        this._numero = value;
    }

    get nombrePlace() : number {
        return this._nombrePlace;
    }

    set nombrePlace(value : number) {
        this._nombrePlace = value;
    }

    constructor(idSalle : number, numero : number, nombrePlace : number){
        this._idSalle = idSalle;
        this._numero = numero;
        this._nombrePlace =nombrePlace;
    }

}
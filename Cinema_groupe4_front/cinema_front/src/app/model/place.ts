export class Place{
    private _id : number;
    private _numPlace : number;
    private _isUsed : boolean;

    get id() : number {
        return this._id;
    }

    set id(value : number) {
        this._id = value;
    }

    get numPlace() : number {
        return this._numPlace;
    }

    set numPlace(value : number) {
        this._numPlace = value;
    }
    get isUsed() : boolean {
        return this._isUsed;
    }

    set isUsed(value : boolean) {
        this._isUsed = value;
    }

    constructor(id : number, numPlace : number, isUsed : boolean){
        this._id = id;
        this._numPlace = numPlace;
        this._isUsed = isUsed;
    }
}
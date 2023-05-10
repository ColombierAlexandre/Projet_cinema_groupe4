export class Place{
    private _numPlace : number;
    private _isUsed : boolean;

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

    constructor(numPlace : number, isUsed : boolean){
        this._numPlace = numPlace;
        this._isUsed = isUsed;
    }
}
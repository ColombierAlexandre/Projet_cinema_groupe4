export class Utilisateur{

    private _idUtilisateur : number
	private  _emailUtilisateur : string
	private _motDePasse : string
	private _nom : string
	private _prenom : string
	private _ville : string
	private _numeroEtRue : string
	private _codePostal : number
	private _numeroCB : number
	private _criptogramme : number
	private _dateNaissance : Date

    constructor(idUtilisateur : number, emailUtilisateur : string, motDePasse : string, nom : string, 
        prenom : string, ville : string, numeroEtRue : string, codePostal : number, numeroCB : number, 
        criptogramme : number, dateNaissance : Date){
        this._idUtilisateur =idUtilisateur
        this._emailUtilisateur = emailUtilisateur
        this._motDePasse = motDePasse
        this._nom = nom
        this._prenom = prenom
        this._ville = ville
        this._numeroEtRue = numeroEtRue
        this._codePostal = codePostal
        this._numeroCB = numeroCB
        this._criptogramme = criptogramme
        this._dateNaissance = dateNaissance
    }

    get idUtilisateur(){
        return this._idUtilisateur
    }
    set idUtilisateur (value : number){
        this._idUtilisateur = value
    }

    get emailUtilisateur(){
        return this._emailUtilisateur
    }
    set emailUtilisateur (value : string){
        this._emailUtilisateur = value
    }

    get motDePasse(){
        return this._motDePasse
    }
    set motDePasse (value : string){
        this._motDePasse = value
    }

    get nom(){
        return this._nom
    }
    set nom (value : string){
        this._nom = value
    }

    get prenom(){
        return this._prenom
    }
    set prenom (value : string){
        this._prenom = value
    }

    get ville(){
        return this._ville
    }
    set ville (value : string){
        this._ville = value
    }

    get numeroEtRue(){
        return this._numeroEtRue
    }
    set numeroEtRue (value : string){
        this._numeroEtRue = value
    }

    get codePostal(){
        return this._codePostal
    }
    set codePostal (value : number){
        this._codePostal = value
    }

    get numeroCB(){
        return this._numeroCB
    }
    set numeroCB (value : number){
        this._numeroCB = value
    }
    
    get criptogramme(){
        return this._criptogramme
    }
    set criptogramme (value : number){
        this._criptogramme = value
    }

    get dateNaissance(){
        return this._dateNaissance
    }
    set dateNaissance (value : Date){
        this._dateNaissance = value
    }


}
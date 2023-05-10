export class Film{
    private _visaExploitation : number;
    private _titre : string;
    private _duree : Date;
    private _realisateur : string;
    private _producteur : string;
    private _acteur : string[];
    private _carcteristique : string[];

    get visaExploitation() : number {
        return this._visaExploitation;
    }

    set visaExploitation(value : number) {
        this._visaExploitation = value;
    }

    get titre() : string {
        return this._titre;
    }

    set titre(value : string) {
        this._titre = value;
    }

    get duree() : Date {
        return this._duree;
    }

    set duree(value : Date) {
        this._duree = value;
    }

    get realisateur() : string {
        return this._realisateur;
    }

    set realisateur(value : string) {
        this._realisateur = value;
    }

    get producteur() : string {
        return this._producteur;
    }

    set producteur(value : string) {
        this._producteur = value;
    }

    get acteur() : string[] {
        return this._acteur;
    }

    set acteur(value : string[]) {
        this._acteur = value;
    }

    get carcteristique() : string[] {
        return this._carcteristique;
    }

    set carcteristique(value : string[]) {
        this._carcteristique = value;
    }

    constructor(visaExploitation : number, titre : string, duree : Date, realisateur : string, producteur : string, acteur : string[], carcteristique : string[]){
        this._visaExploitation = visaExploitation;
        this._titre = titre;
        this._duree = duree;
        this._realisateur = realisateur;
        this._producteur = producteur;
        this._acteur = acteur;
        this._carcteristique = carcteristique;
    }
}
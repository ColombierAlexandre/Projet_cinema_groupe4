import { Component } from '@angular/core';

@Component({
  selector: 'app-afficher-un-film',
  templateUrl: './afficher-un-film.component.html',
  styleUrls: ['./afficher-un-film.component.css']
})
export class AfficherUnFilmComponent {

  image : string = "../assets/images/django.jpg"

  affiche_front : string = "../assets/images/django.jpg"

}

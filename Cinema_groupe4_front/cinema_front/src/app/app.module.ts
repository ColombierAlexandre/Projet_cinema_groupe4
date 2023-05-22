import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './contant/header/header.component';
import { FooterComponent } from './contant/footer/footer.component';
import { AfficherUnFilmComponent } from './composant/afficher-un-film/afficher-un-film.component';
import { CarouselComponent } from './composant/carousel/carousel.component';

import { FormulaireConnexionComponent } from './composant/formulaire-connexion/formulaire-connexion.component';
import { FormulaireInscriptionComponent } from './composant/formulaire-inscription/formulaire-inscription.component';
import { ListeFilmComponent } from './composant/liste-film/liste-film.component';
import { PlaceComponent } from './composant/place/place.component';
import { ValiderTicketComponent } from './composant/valider-ticket/valider-ticket.component';
import { ListeProgrammationComponent } from './composant/liste-programmation/liste-programmation.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ListeCinemaComponent } from './composant/afficher-cinema/afficher-cinema.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    AfficherUnFilmComponent,
    CarouselComponent,
    ListeCinemaComponent,
    FormulaireConnexionComponent,
    FormulaireInscriptionComponent,
    ListeFilmComponent,
    PlaceComponent,
    ValiderTicketComponent,
    ListeProgrammationComponent,
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

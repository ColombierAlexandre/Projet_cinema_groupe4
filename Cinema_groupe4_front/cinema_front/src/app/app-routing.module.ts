import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListeFilmComponent } from './composant/liste-film/liste-film.component';
import { ValiderTicketComponent } from './composant/valider-ticket/valider-ticket.component';

const routes: Routes = [
  {path:"listFilms",component:ListeFilmComponent},
  {path:"validerTicket",component:ValiderTicketComponent},
  
  {path:"",redirectTo: '/listFilms',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

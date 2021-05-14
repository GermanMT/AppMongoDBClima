import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowComponent } from './location/show/show.component';
import { ListarComponent } from './home/listar/listar.component';

const routes: Routes = [
  {path: 'show', component: ShowComponent},
  {path: 'listar', component: ListarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

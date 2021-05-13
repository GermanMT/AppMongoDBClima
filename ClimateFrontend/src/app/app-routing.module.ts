import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowComponent } from './home/show/show.component';
import { ListarComponent } from './provincia/listar/listar.component';

const routes: Routes = [
  {path: 'show', component: ShowComponent},
  {path: 'listar', component: ListarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

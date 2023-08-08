import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserDataComponent } from './user-data/user-data.component';
import { UserFormComponent } from './user-form/user-form.component';

const routes: Routes = [
  { path: 'users/:id', component: UserDataComponent },
  { path: 'users', component: UserFormComponent },  
  { path: '', redirectTo: 'users', pathMatch: 'full' }
];


@NgModule({
  imports: [
    RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

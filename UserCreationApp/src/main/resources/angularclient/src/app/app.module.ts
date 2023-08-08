import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { UserFormComponent } from './user-form/user-form.component';
import { UserDataComponent } from './user-data/user-data.component'; 
import { HttpClientModule } from '@angular/common/http';
// import { UserService } from './user.service';



@NgModule({
  declarations: [
    AppComponent,
    UserFormComponent,
    UserDataComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,   //Assign FormsModule
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})

export class UserService {

  private baseUrl = "http://localhost:8080/users"
  
  constructor(private http: HttpClient) {

  }

  public findUserById(id: number): Observable<User> {
    return this.http.get<User>('${this.baseUrl}/${id}');
  }

  public addUser(user: User): Observable<Object> {
    return this.http.post<User>(this.baseUrl, user);
  }
}
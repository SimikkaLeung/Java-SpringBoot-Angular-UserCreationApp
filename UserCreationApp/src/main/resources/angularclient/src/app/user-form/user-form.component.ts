import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  user: User = new User();

  constructor(private userService: UserService, private router: Router)
  { }

  ngOnInit(): void {
  }

  addUser() {
    // this.userService.addUser(this.user);
    this.userService.addUser(this.user).subscribe(data => {this.user = data;});
  }

  submitted = false;

  onSubmit() {
    this.addUser();
    this.submitted = true;
   
  }

  newUser() {
    this.user = new User('', '');
  }

}

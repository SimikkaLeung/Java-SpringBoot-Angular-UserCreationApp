import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user.service';
import { User } from '../user';
import { switchMap } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-user-data',
  templateUrl: './user-data.component.html',
  styleUrls: ['./user-data.component.css']
})
export class UserDataComponent implements OnInit  {
  id!: number;
  user! : User;


  constructor(private userService: UserService,
    private route: ActivatedRoute, private router: Router) {

    
  }

  ngOnInit() {
    this.id = this.route.snapshot.params['id'];

    this.userService.findUserById(this.id).subscribe(data => {
      this.user = data;
      console.log(this.user);
    });
  }

  showUser(id: number) {
    this.router.navigate(['users', id]);
  }

}

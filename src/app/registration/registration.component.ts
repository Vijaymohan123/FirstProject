import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators } from '@angular/forms';
import {Router }from '@angular/router'
import {SharedserviceService}from "./../sharedservice.service"



@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  
  registrationObject:FormGroup;
  constructor(private router:Router,
    private service:SharedserviceService,private registrationFormBuilder:FormBuilder
) {  
  this.registrationObject = this.registrationFormBuilder.group({
    dasId: ['', [Validators.required]],
    candidateName: ['', [Validators.required]],
    password: ['', [Validators.required]],
  totalExperience:['',[Validators.required]],
  age:['',[Validators.required]],
  relevantExperience:['',[Validators.required]],
  expectedLWD:['',[Validators.required]],
  location:['',[Validators.required]],
  skills:['',[Validators.required]],
  technology:['',[Validators.required]],
  martialStatus:['',[Validators.required]],
  cardStatus:['']
  });

  }

  ngOnInit(): void {
  }

  //get mapping data

  collectRegister()
  {
    this.service.register().subscribe((reg)=>{console.log(reg)});
   // this.router.navigate(["/login"]);
    console.log("Received Response");
  }

  //post mapping data

  save()
  {
      if(this.registrationObject.invalid){
        return ;
      }
      let a = {...this.registrationObject.value,cardStatus:"Backlog"};
      console.log(a, "----> 57");
     this.router.navigate(['/login']);
     this.service.saveData(a).subscribe((a)=>{console.log(a)});
  }

}


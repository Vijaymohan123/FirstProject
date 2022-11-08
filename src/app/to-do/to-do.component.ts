import { CdkDragDrop, moveItemInArray, transferArrayItem } from '@angular/cdk/drag-drop';
import { Component, OnInit } from '@angular/core';
import { SharedserviceService } from '../sharedservice.service';
import {ngxCsv} from 'ngx-csv';
import { MatDialog } from '@angular/material/dialog';
import { PopupComponent } from '../popup/popup.component';



@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.css']
})

export class ToDoComponent implements OnInit {
data: any[]=[];
constructor(private service:SharedserviceService,
  private dialogRef:MatDialog)
{ }

ngOnInit(): void {
  this.getBackLog();
}
   searchText:string='';
   commentText:string='';
   exportCSVData:any[]=[];
   exportCSVText:string='';
   name:string='';

   

   backlog:any = [];
   initialScreening:any = [];
   onHold:any=[]
   inProgress:any=[];
   managerDiscussion:any=[];
   selected:any=[];
   rejected:any=[];
   Comments:any=[];
   searchResult:any = [];
   popupState :any = {};
   toggle:any = false;

   
name1:string='';

searchData()
{
   this.service.enter(this.searchText).subscribe((data)=>{
    this.searchResult = data;
   });
 }
 getBackLog(){
  this.service.getBgLog().subscribe((data:any)=>{
    this.exportCSVData=data;
    // let userName:any = (data || []).map((user:any) => user.candidateName);
    this.backlog = ( data || []);
  }
  );
 }
  
//   exportCSV(data: any) {    
//   this.service.enterCSVData().subscribe((data)=>{console.log(data)});
// }
//   (this.service.enterCSVData().subscribe((data)=>{console.log(data)}));
//  }

candidateName()
{
  if(this.name==="")
  {
    return; 
  }
  this.name='';
  // this.service.enter().subscribe((backlog)=>this.backlog.push());
  console.log("hello");
}

// candidate:any;
// enterData()
// {
//   console.log("clicked");
//   this.service.enter(this.candidate.value).subscribe((data)=>console.log("data"));
// }

buttonText(val:any)
{ 
  console.log(val)
  this.popupState = val;
  this.toggle = true;
}
closeoverLay(){
  console.log("Iam coming insied 93")
  this.toggle = false;
  this.popupState = {};
}
data1:any='';
deleteTask()
{
  this.service.deleteCard().subscribe();
}
commentData()
{
  if(this.commentText.length > 0){
    this.service.commentSection(this.commentText).subscribe((data) => console.log(data, "chacking the comment 71")); 
  }
  // this.service.commentSectionToGetData().subscribe((data)=>{console.log(data)});
}


  drop(event: CdkDragDrop<string[]>): void {
    console.log('from ' + event.previousContainer.id + ' to '+ event.container.id);
    if (event.previousContainer === event.container) {
      moveItemInArray(event.container.data, event.previousIndex, event.currentIndex);
    } else {
      transferArrayItem(event.previousContainer.data,
                        event.container.data,
                        event.previousIndex,
                        event.currentIndex);
    }
  }
  exportCSV() {  
    new ngxCsv(this.exportCSVData,"registerlogin");
  }

  openButton()
  {
    this.dialogRef.open(PopupComponent); 
    console.log("Hi i am open button");
  }

  commentButton(val:any)
  {
    console.log("I am from commentButton",val);
    this.popupState=val;
  }

  dragItem()
  {
    console.log("i am drag button 233");
  }


  
  



}

import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SharedserviceService {
  private singleUser="http://localhost:8080/single/{dasId}";
  private registerUrl='http://localhost:8080/Registration';
  private postUrl='http://localhost:8080/register';
  private updateSingleUserUrl='http://localhost:8080/update/{id}';
  private updateUrl='http://localhost:8080/update';
  private deleteUrl='http://localhost:8080/delete/{dasId}';
  private searchUrl='http://localhost:8080/search';
  private toSeeCardStatus='http://localhost:8080/card/{id}';
  private commentUrl='http://localhost:8080/comments';
  private getCommentUrl='http://localhost:8080/getComments';

  

  constructor(private http:HttpClient) {}
  data:any
  
  register()
  {
    return this.http.get(this.registerUrl);
  }
 saveData(registrationData:any)
 {
  console.log(registrationData,"shared 24" );
  return this.http.post(this.postUrl,registrationData);
 }

 enter(searchText:string)
 {
  let link = `${this.searchUrl}?query=${searchText}`;
  return this.http.get(link);
 }

 deleteCard()
 {
    return this.http.delete(this.deleteUrl);
 }

 commentSection(comment:string)
 {
  return this.http.post(this.commentUrl,comment);
 }
 commentSectionToGetData()
 {
  return this.http.get(this.getCommentUrl);
 }
 getBgLog(){
  return this.http.get(this.registerUrl);
 }
 enterCSVData()
 {
  return this.http.get(this.registerUrl);
 }



}


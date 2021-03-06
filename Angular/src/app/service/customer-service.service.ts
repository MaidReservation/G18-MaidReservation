import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {
  public API = '//localhost:8080';

  constructor(private http: HttpClient) { }

    getTitlenameType(): Observable<any> {
    return this.http.get(this.API + '/title');
  }
    getTypeworking(): Observable<any> {
    return this.http.get(this.API + '/typeworking');
  }
    getTypeworkingDate(): Observable<any> {
    return this.http.get(this.API + '/workingDate');
  }
    getMaidName(): Observable<any> {
    return this.http.get(this.API + '/maidName');
  }
    getMaidAddress(): Observable<any> {
    return this.http.get(this.API + '/maidAddress');
  }
    getMaidEmail(): Observable<any> {
    return this.http.get(this.API + '/maidEmail');
  }
    getMaidPhone(): Observable<any> {
    return this.http.get(this.API + '/maidPhone');
  }
    getProvince(): Observable<any> {
    return this.http.get(this.API + '/province');
  }
    getDistrict(): Observable<any> {
    return this.http.get(this.API + '/district');
  }
    getCanton(): Observable<any> {
    return this.http.get(this.API + '/canton');
  }
    saveRegi(data:any): Observable<any>{
    return this.http.post(this.API+'/regi',data);
 }
}

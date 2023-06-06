import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {

  configUrl = 'http://localhost:8080/';

  constructor(private http: HttpClient) {
  }

  getConvertedNumber(inputNumber: number): Observable<any> {
    return this.http.get<number>(`${this.configUrl}kata-for-fun/${inputNumber}`);
  }

}

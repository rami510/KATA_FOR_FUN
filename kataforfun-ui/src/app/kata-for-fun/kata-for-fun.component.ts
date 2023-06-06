import {Component, OnInit, OnDestroy} from '@angular/core';
import {KataForFunService} from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent implements OnInit, OnDestroy {

  convertedValues: NumberConverted[] = [];

  constructor(private kataForFunService: KataForFunService) {
  }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.kataForFunService.getConvertedNumber(inputNumber).subscribe(value => {
      this.convertedValues.push({numberToConvert: inputNumber, result: value.result});
    }, error => {
      console.log(error);
    });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}

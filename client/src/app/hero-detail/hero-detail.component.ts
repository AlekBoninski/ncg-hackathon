import { Component, OnInit, Input } from '@angular/core';
import { Car } from '../car';

@Component({
  selector: 'app-hero-detail',
  templateUrl: './hero-detail.component.html',
  styleUrls: ['./hero-detail.component.css']
})
export class HeroDetailComponent implements OnInit {

  @Input() hero: Car;

  constructor() { }

  ngOnInit() {
  }

}

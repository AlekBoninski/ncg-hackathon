import { Component, OnInit } from '@angular/core';
import {Car} from '../car';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  selectedHero;

  heroes: Car[];

  constructor(private heroService: HeroService) { }

  ngOnInit() {
    this.heroService.getCars().subscribe(data => {
      console.log('gotten data: ' + data)
      this.heroes = data;
    });
  }

  onSelect(hero: Car) {
    this.selectedHero = hero;
  }

  unselect() {
    this.selectedHero = null;
  }

  // getHeroes(): void {
  //   this.heroes = this.heroService.getCars();
  // }
}

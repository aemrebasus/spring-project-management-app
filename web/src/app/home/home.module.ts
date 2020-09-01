import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


import { HighlightDirective } from './highlight.directive';
import { UnlessDirective } from './unless.directive';

@NgModule({
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    HighlightDirective,
    UnlessDirective
  ],
  imports: [
    CommonModule,
  ],
  exports: [
    HomeComponent,
    PageNotFoundComponent
  ]
})
export class HomeModule { }

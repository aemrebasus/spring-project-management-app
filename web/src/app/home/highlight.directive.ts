import { Directive, ElementRef, HostListener, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective implements OnInit {

  @Input() color0: string;
  @Input() color1: string;
  @Input() textColor: string;
  @Input() appHighlight: string;


  constructor(private elRef?: ElementRef<HTMLHeadingElement>) { }

  ngOnInit(): void {
    this.elRef.nativeElement.style.color = this.textColor || 'black';
    this.elRef.nativeElement.style.backgroundColor = this.color1 || 'brown';
    this.elRef.nativeElement.style.backgroundColor = this.appHighlight;

  }

  @HostListener('mouseenter')
  onMouseEnter() {
    this.highlight(this.color0 || 'yellow');
  }

  @HostListener('mouseleave')
  onMouseLeave() {
    this.highlight(this.color1 || 'brown');
  }

  @HostListener('click')
  onMouseClick() {
    // const name = prompt('Your name');
    // const name1 = prompt('Your name');
    // confirm('Is that your name?  ' + name);
    navigator.geolocation.getCurrentPosition((pos) => {
      alert(pos.coords.latitude);
    });

  }

  highlight(color: string) {
    this.elRef.nativeElement.style.backgroundColor = color;
  }

}

import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ListeCinemaComponent } from './afficher-cinema.component';


describe('AfficherCinemaComponent', () => {
  let component: ListeCinemaComponent;
  let fixture: ComponentFixture<ListeCinemaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeCinemaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListeCinemaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

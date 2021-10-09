import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminUpdateEmployeComponent } from './admin-update-employe.component';

describe('AdminUpdateEmployeComponent', () => {
  let component: AdminUpdateEmployeComponent;
  let fixture: ComponentFixture<AdminUpdateEmployeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminUpdateEmployeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminUpdateEmployeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

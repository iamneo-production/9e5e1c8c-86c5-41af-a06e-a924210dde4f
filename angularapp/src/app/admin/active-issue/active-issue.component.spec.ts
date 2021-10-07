import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActiveIssueComponent } from './active-issue.component';

describe('ActiveIssueComponent', () => {
  let component: ActiveIssueComponent;
  let fixture: ComponentFixture<ActiveIssueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActiveIssueComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ActiveIssueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

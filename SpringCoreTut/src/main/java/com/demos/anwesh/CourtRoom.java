package com.demos.anwesh;;
public class CourtRoom {
    private Judge judge;
    public CourtRoom() {
      
    }
    public void setJudge(Judge judge) {
        this.judge = judge;
    }
    public CourtRoom(Judge judge) {}
    public void decide() {
        judge.decide();
    }
    public void maintainOrder() {
        judge.maintainPeace();
    }

}

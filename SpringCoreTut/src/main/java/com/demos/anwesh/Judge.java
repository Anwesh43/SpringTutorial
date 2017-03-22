package com.demos.anwesh;
public class Judge {
    private String name;
    public Judge(String name) {
        this.name = name;
    }
    public void decide() {
        System.out.println("judge "+name+" will decide");
    }
    public void maintainPeace() {
        System.out.println("judge "+name+" needs peace");
    }
}

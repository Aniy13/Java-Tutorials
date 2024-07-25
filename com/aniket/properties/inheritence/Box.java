package com.aniket.properties.inheritence;

public class Box {

    double l;
    double w;
    double b;

    public Box(double l, double w, double b) {
        this.l = l;
        this.w = w;
        this.b = b;
    }

    public Box() {
        this.l=-1;
        this.w=-1;
        this.b=-1;
    }
    public Box(double side){
        this.l=side;
        this.w=side;
        this.b=side;
    }
    public Box(Box other){
        this.l=other.l;
        this.w=other.w;
        this.b=other.b;
    }
    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }
}

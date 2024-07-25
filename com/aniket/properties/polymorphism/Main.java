package com.aniket.properties.polymorphism;
import java.lang.*;
public class Main {
    public  void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        circle.area();
    }
}




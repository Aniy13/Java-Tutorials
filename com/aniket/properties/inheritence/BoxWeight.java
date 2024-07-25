package com.aniket.properties.inheritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double l, double w, double b, double weight) {
        super(l, w, b);
        this.weight = weight;
    }

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(Box other, double weight) {
        super(other);
        this.weight = weight;
    }


}

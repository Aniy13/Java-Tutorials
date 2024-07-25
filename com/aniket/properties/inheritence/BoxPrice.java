package com.aniket.properties.inheritence;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice(double l, double w, double b, double weight) {
        super(l, w, b, weight);
    }
}

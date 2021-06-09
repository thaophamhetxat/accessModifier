package com.codegym;

public class AccessModifier {
    private double radius = 1;
    private String color = "red";

    // hàm không giá trị luôn ở trên đầu
    public AccessModifier() {

    }

    public AccessModifier(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;


    }


}

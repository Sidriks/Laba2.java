package com.company;

import lombok.ToString;

@ToString
public class Parallelepiped extends Rectangle {
    protected double height;

    Parallelepiped(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printVolume() {
        System.out.println(String.format("volume %s", calculateVolume()));
    }

    public double calculateVolume() {
        return this.height * this.length * this.width;
    }

    public double calculatePerimeter() {
        return 4 * (this.length + this.width + this.height);
    }

    public double calculateSquare() {
        return 2 * (this.length * this.width + this.width * this.height + this.height * this.length);
    }

    public void printPerimeter() {
        System.out.println(String.format("perimeter %s", calculatePerimeter()));
    }

    public void printSquare() {
        System.out.println(String.format("square %s", calculateSquare()));
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                "height=" + height +
                '}';
    }
}

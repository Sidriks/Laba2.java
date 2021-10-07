package com.company;

import lombok.ToString;

@ToString
public class Rectangle {
    protected double length;
    protected double width;

    Rectangle(double length, double width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void PrintLengthWidth() {
        System.out.println(String.format("length %s \n width %s", this.length, this.width));
    }

    public void PrintDiagonal() {
        System.out.println(String.format("diagonal length %s", calculateDiagonal()));
    }

    public double calculateDiagonal() {
        return Math.sqrt(this.length * this.length + this.width * this.width);
    }

    public void PrintPerimeter() {
        System.out.println(String.format("Perimeter %s", calculatePerimeter()));
    }

    public double calculatePerimeter() {
        return this.length * 2 + this.width * 2;
    }

    public void PrintSquare() {
        System.out.println(String.format("Square %s", calculateSquare()));
    }

    public double calculateSquare() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

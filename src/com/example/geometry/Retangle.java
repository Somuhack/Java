package com.example.geometry;

 public class Retangle {
    private double width;
    private double height;

    public void setHeightAndWeidth(double height,double width) {
        this.height = height;
        this.width = width;
    }

    public double area(){
        return this.height*this.width;
    }
}

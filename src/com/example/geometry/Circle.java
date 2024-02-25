package com.example.geometry;
  public class Circle {
     private double radious;
      public  void setRadious(double radious){
          this.radious=radious;
      }
      public double getRadious(){
          return radious;
      }
     public double area(){
         return Math.PI*Math.pow(radious,2);
     }
}
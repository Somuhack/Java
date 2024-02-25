package com.example.util;

import com.example.geometry.Circle;
import com.example.geometry.Retangle;


class Calculator {
    public static void main(String[] args) {
        Retangle rc = new Retangle();
        Circle cs = new Circle();

        rc.setHeightAndWeidth(10,20);
        System.out.println("The area of retangle : "+rc.area());

        cs.setRadious(5);
        System.out.println("The area of Circle : "+cs.area());
    }
}

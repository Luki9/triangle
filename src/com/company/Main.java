package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle triangle1 = new Triangle(3,4,4);

        Calc calc1 = new Calc();


        System.out.println(calc1.isRightTriangle(triangle1));

    }
}

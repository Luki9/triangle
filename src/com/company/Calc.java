package com.company;

import static java.lang.Math.pow;

public class Calc {

    boolean isRightTriangle(Triangle t){
       return pow(t.getA(),2) + pow(t.getB(),2) == pow(t.getC(),2) ||  pow(t.getB(),2) + pow(t.getC(),2) == pow(t.getA(),2) ||  pow(t.getC(),2) +  pow(t.getA(),2) == pow(t.getB(),2);


        }



        }

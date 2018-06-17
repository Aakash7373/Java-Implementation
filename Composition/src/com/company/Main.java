package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(2,4,5);
	    Case thecase=new Case("AA12","Dell","5v",dimensions);

	    Resolution resolution=new Resolution(20,30);
	    Monitor themoni=new Monitor("AA11","HP",50,resolution);
	    Motherboard motherboard=new Motherboard("B23","Lenovo",3,5,"11s");

	    PC newpc=new PC(thecase,themoni,motherboard);
    newpc.powerup();
    }
}

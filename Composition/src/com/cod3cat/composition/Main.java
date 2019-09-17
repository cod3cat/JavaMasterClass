package com.cod3cat.composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20 ,5);
	    Case theCase = new Case("220B","Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
	    Motherboard motherboard = new Motherboard("BJ-220", "ASUS", 4, 2, "v2.44");

	    PC thePc = new PC(theCase,theMonitor,motherboard);
	    thePc.getMonitor().drawPixelAt(1500,1200, "Red");
		thePc.getMotherboard().loadProgram("Windows 10");
		thePc.getTheCase().pressPowerButton();
    }
}

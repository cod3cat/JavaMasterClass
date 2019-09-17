package com.cod3cat.exercise;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(40, "Duplex", 500);
        System.out.println("Printer type " + printer.getPrinterType());
        System.out.println("Current toner level = " + printer.getTonerLevel());
        printer.print(10);
        printer.print(25);
        printer.addToner(20);
        printer.addSheets(200);
        printer.print(750);
        printer.addToner(300);
    }
}

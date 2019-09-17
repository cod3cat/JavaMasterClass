package com.cod3cat.exercise;

public class Printer {
    private int tonerLevel;
    private int noOfPagesPrinted = 0;
    private boolean printerType = true;
    private int sheets = 100;

    public Printer(int tonerLevel, String printerType, int sheets) {
        this.sheets = sheets > 0 && sheets <= 300 ? sheets : 100;
        this.tonerLevel = tonerLevel > 0 && tonerLevel <=100 ? tonerLevel : 100;
        this.printerType = printerType.equalsIgnoreCase("Duplex") ? true : false;
    }

    public void print(int pages){
        if(printerType){
            if(this.sheets - pages / 2 > 0){
                this.noOfPagesPrinted = this.noOfPagesPrinted + pages / 2;
                this.tonerLevel -= pages / 2;
            }else{
                System.out.println("Not enough no. of sheets. Add " + (pages / 2 -  this.sheets) + " more sheets");
            }
        }else{
            if(this.sheets - pages > 0){
                this.noOfPagesPrinted = this.noOfPagesPrinted - pages;
                this.tonerLevel -= pages;
            }else{
                System.out.println("Not enough no. of sheets. Add " + (pages -  this.sheets) + " more sheets");
            }
        }

        System.out.println("Page printed");
        System.out.println("Total number of pages printed " + getNoOfPagesPrinted());
    }

    public void addToner(int tonerLevel){
        this.tonerLevel = tonerLevel + getTonerLevel() > 0 && tonerLevel + getTonerLevel() <=100 ? tonerLevel + getTonerLevel() : 100;
        System.out.println("Toner added. New toner level = " +getTonerLevel());
    }

    public void addSheets(int sheets){
        this.sheets = sheets > 0 && sheets + this.sheets <= 300 ? sheets : 300;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public String getPrinterType() {
        if(this.printerType){
            return "Duplex";
        }else{
            return "Simplex";
        }
    }
}

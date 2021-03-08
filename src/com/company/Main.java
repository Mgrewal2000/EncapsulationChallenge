package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer prin = new Printer(50,false);
        System.out.println("Initial page count: " + prin.getPagesPrinted());
        int pagesPrinted = prin.printPages(7);
        System.out.println("Pages printed was " + pagesPrinted + " for a new total of " + prin.getPagesPrinted());
    }
}

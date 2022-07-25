package com.company;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Argen", "Programmer", "Peaksoft");
        Dancer dancer = new Dancer("Malika", "Dancer", "BTS");
        Singer singer = new Singer("Doni", "Singer", "Shadow");
        System.out.println(programmer);
        programmer.coding();
        programmer.Learn();
        programmer.Walk();
        programmer.Eat();
        System.out.println("----------------------");
        System.out.println(dancer);
        dancer.dancing();
        dancer.Learn();
        dancer.Walk();
        dancer.Eat();
        System.out.println("-----------------------");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.Learn();
        singer.Walk();
        singer.Eat();
    }
}
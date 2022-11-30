package com.example.inheritance_ex;

import java.util.Scanner;

public class Bike extends Vehicle {

    private String seatColor;

    public String getSeatColor() {
        return seatColor;
    }

    public void setSeatColor(String seatColor) {
        this.seatColor = seatColor;
    }


    Bike()
    {
        setTyres(2);
        setCc(100);
    }
    public void seat()
    {
        System.out.println("\nWhat Colour of Seat you want for Bike? ::");
       Scanner sc = new Scanner(System.in);
       setSeatColor(sc.next());
        System.out.println("Seat Colour of bike is "+getSeatColor());
    }

}
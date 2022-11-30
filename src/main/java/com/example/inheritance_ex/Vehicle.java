package com.example.inheritance_ex;

public class Vehicle {
    private int tyres;
    private int cc;

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void display()
    {
        System.out.print("\nThis vehicle has " +tyres+" tyres and "+ cc+" CC Engine \n Hence, this is a");
        if(tyres==2){
            System.out.print(" Bike");
        }
        else if (tyres==4){
            System.out.print(" Car");
        }
        else System.out.print(" Bicycle");
    }

    Vehicle()
    { tyres =0; cc =0;
        System.out.println();
    }
}

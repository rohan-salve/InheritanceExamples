package com.example.inheritance_ex;

//ENHMNT0001

public class CheckVehicle {

    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        Vehicle v3 = new Vehicle();

        Vehicle [] v4= new Vehicle[3];

        v4[0]=v1; v4[1]=v2; v4[2]=v3;

        Owner me = new Owner("Rohan","Pune", 28,v4);
        me.display();


    }
}

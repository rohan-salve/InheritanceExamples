package com.example.inheritance_ex;



public class CheckVehicle {

    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.display();


        Vehicle v2 = new Car();
        v2.display();

        Vehicle v3 = new Vehicle();
        v3.display();

        Bike b1 = new Bike();
        b1.display();
        b1.seat();
    }
}

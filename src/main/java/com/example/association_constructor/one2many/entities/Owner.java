package com.example.association_constructor.one2many.entities;

//Target class for Constructor Injection
public class Owner {

    //Instance Variable
    String oName, city;
    int age;

    //has-a relation
    Vehicle[] vehicles;

    public Owner(String oName, String city, int age, Vehicle[] vehicles)
    {
        this.oName  = oName;
        this.city = city;
        this.age = age;

        this.vehicles = vehicles;

    }
    public void display()
    {

        System.out.println("****INFO OF OWNER****");
        System.out.println("Name of Owner - "+oName+" Age - "+age+" City - "+city);

        System.out.println("************************");
        System.out.println("****Vehicles he OWN*****");

        for (Vehicle vehicle : vehicles)
        {
           vehicle.display();
        }
    }

}

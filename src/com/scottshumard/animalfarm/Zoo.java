package com.scottshumard.animalfarm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scott on 2016-08-04.
 */
public class Zoo {
    // a zoo has gorillas, location, name, fare, operating hours, phone number, website
    private String name;
    private String location;
    private double fare;
    private String hours;
    private String phoneNumber;
    private String website;

    private ArrayList<Gorilla> gorillas = new ArrayList<>();

    public Zoo(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public ArrayList<Gorilla> getGorillas() {
        return gorillas;
    }

    public void addGorilla(Gorilla bob) {
        this.gorillas.add(bob);
    }

    public void listGorillas() {
        for(Gorilla g : this.gorillas) {
            System.out.println(g);
        }
    }

}

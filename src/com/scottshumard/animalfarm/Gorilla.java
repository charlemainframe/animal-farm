package com.scottshumard.animalfarm;

/**
 * Created by scott on 2016-08-04.
 */
public class Gorilla {
  // Gorilla
    private String name;
    private int age;
    private String colour;
    private boolean isAggressive = false;

    public Gorilla (String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public Gorilla (String name, int age, String colour, boolean isAgressive) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.isAggressive = isAgressive;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getColour() { return colour; }
    public boolean isAggressive() { return isAggressive; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setColour(String colour) { this.colour = colour; }
    public void setAggressive(boolean aggressive) { isAggressive = aggressive; }

    public String toString() {
        String aggressiveStatus = "not aggressive";

        if (this.isAggressive) {
            aggressiveStatus = "aggressive";
        }


        return String.format("A gorilla named %s, aged %d, who is %s, and is %s",
                        this.name, this.age, this.colour, aggressiveStatus);
    }
}

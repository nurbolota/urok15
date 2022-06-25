package com.company;

import java.util.Locale;

public class Animal {
    private String eat;

public Animal(){
}
public void eat(){
    System.out.println("Animal is eating");
    System.out.println("com.company.Animal is eating");

}


    @Override
    public String toString() {
        return "Animal{" +
                "eat='" + eat + '\'' +
                '}';
    }
}





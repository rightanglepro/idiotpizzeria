package com.company;

public class Idiot {
    private String name, address;
    public Idiot(String n, String a){
        name = n;
        address = a;
    }

    public String toString(){
        return name + " @ " + address;
    }
}

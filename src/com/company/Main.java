package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza defaultTest = new Pizza();
        System.out.println(defaultTest);
        String[] top = {"basil", "tomato slices"};
        Pizza constructTest = new Pizza("Alfredo", "no", top, 14);
        System.out.println(constructTest);
    }
}


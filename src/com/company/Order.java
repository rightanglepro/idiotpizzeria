package com.company;
import static java.lang.System.*; import java.util.*;
public class Order {
    private Pizza myPizza; private Idiot myCust;
    public Order() {
        Scanner kb = new Scanner(in);
        out.print("Victor: Welcome to Idiot Pizzeria how may I help you?\n(1) Order Pizza\n>>> ");
        switch (kb.nextInt()) {
            case 1:
                kb.nextLine();
                out.print("Victor: What kind of sauce? (\'No\' for none) >>> ");
                String s = kb.nextLine();
                out.print("Victor: What kind of cheese? (\'No\' for none) >>> ");
                String c = kb.nextLine();
                out.print("Victor: How many toppings? >>> ");
                String[] t = new String[kb.nextInt()];
                kb.nextLine();
                for (int i = 0; i < t.length; i++) {
                    out.print("Victor: What's topping number " + (i + 1) + "? >>> ");
                    t[i] = kb.nextLine();
                }
                out.print("Victor: What size pizza? (Small - 12\" Med - 14\" Large - 16\") >>> ");
                int si = kb.nextInt();
                kb.nextLine();
                myPizza = new Pizza(s, c, t, si);
                out.print("Victor: So you want " + myPizza + "? >>> ");
                char answer = kb.nextLine().toLowerCase().charAt(0);
                if (answer != 'y') {
                    out.println("Victor: Alright, Scratch that.");
                    exit(0);
                }
                out.print("Victor: Great! That'll be $" + myPizza.getCost() + "0 What's your name? >>> ");
                String n = kb.nextLine();
                out.print("Victor: and your delivery address? >>> ");
                String a = kb.nextLine();
                myCust = new Idiot(n, a);
                out.print("Victor: Alright. " + myPizza + " for " + myCust + " coming right up!");
                break;
            default:
                out.println("Victor: I'm sorry I didn't quite get that.");
                exit(0);
        }
    }
    public String toString(){
        return "" + myPizza + " for " + myCust;
    }
}


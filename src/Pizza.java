public class Pizza {
    private String sauce, cheese; private String[] toppings; private int size; private double cost;

    public Pizza(){
        sauce = "red"; cheese = "mozzarella"; toppings = new String[0]; size = 12; cost = 5;
    }

    public Pizza(String s, String c, String[] t, int si){
        sauce = s; cheese = c; toppings = t; size = si;
        cost = 5 + (0.5 * toppings.length);
    }

    public String toString(){
        String ret =  "A " + size + "\" pizza with " + sauce + " sauce, " + cheese + " cheese " + toppings.length + " toppings(";
        for (int i = 0; i < toppings.length; i++){
            if(i != toppings.length-1){
                ret += toppings[i] + ", ";
            } else{
                ret += toppings[i] + ")";
            }
            ret += "\n Cost: $" + cost;
        }
        return ret;
    }
    }



package FactoryRework;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
//    Veggies veggies [];
//    Pepperoni pepperoni;
//    Clams clams;
//    Cheese cheese;

    abstract void prepare();

    void bake(){
        System.out.println("Baking");
    }

    void cut(){
        System.out.println("Cutting");
    }

    void box(){
        System.out.println("Place pizza in the box");
    }

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }
}

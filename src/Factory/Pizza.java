package Factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("adding souce ");
        System.out.println("Toppings: ");
        for(int i = 0; i< toppings.size(); i++){
            System.out.println( "     " + toppings.get(i));
        }
    }

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
}

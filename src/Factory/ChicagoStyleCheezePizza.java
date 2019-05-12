package Factory;

public class ChicagoStyleCheezePizza extends Pizza {
    public ChicagoStyleCheezePizza() {
        name = "Chicago style pizza with souce";
        dough = "Thick crust dough;";
        sauce = "Plam Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }

    void cut(){
        System.out.println("Cutting Pizza into the square pieces");
    }
}

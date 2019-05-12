package FactoryRework;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("preparing " + name);
//        dough = pizzaIngredientFactory.createDough();
//        sauce = pizzaIngredientFactory.createSauce();
//        cheese = pizzaIngredientFactory.createCheese();
//        clams = pizzaIngredientFactory.createClams();
    }
}

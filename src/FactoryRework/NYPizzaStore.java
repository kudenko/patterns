package FactoryRework;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPiizzaingredientFactory();
       if(type.equals("cheese")){
           pizza = new CheesePizza(pizzaIngredientFactory);
           pizza.name = "NEW YORK STYLE CHEESE PIZZA";
//       } else if(type.equals("veggie")){
//           pizza = new VeggiePizza(pizzaIngredientFactory);
//           pizza.name = "NY VEGGIE PIZZA";
       }return pizza;
    }
}

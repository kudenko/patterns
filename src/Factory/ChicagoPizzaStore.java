package Factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheezePizza();
//        } else if(type.equals("veggie")){
//            return new ChicagoStyleVeggiePizza();
//        } else if(type.equals("clam")){
//            return new ChicagoStyleClamPizza();
//        } else if(type.equals("pepperoni")){
//            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}

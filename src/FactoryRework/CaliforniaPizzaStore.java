package FactoryRework;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
//        if(type.equals("cheeze")){
//            return new CaliforniaStyleCheezePizza();
//        } else if(type.equals("veggie")){
//            return new CaliforniaStyleVeggiePizza();
//        } else if(type.equals("clam")){
//            return new CaliforniaStyleClamPizza();
//        } else if(type.equals("pepperoni")){
//            return new CaliforniaStylePepperoniPizza();
//        } else return null;
        return  null;
    }
}

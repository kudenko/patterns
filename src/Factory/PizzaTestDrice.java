package Factory;

public class PizzaTestDrice {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println("===============================================");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println("===============================================");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println("===============================================");

        pizza = nyStore.createPizza("cheese");
        System.out.println(pizza.getName());

    }
}

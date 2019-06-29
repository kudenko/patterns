package composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String descrription;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String descrription, boolean vegetarian, double price) {
        this.name = name;
        this.descrription = descrription;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    @Override
    public void print() {
        System.out.println("MenuItem{" +
                "name='" + name + '\'' +
                ", descrription='" + descrription + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}');
    }
    @Override
    public boolean isVegetarian(){
        return vegetarian;
    }
    public Iterator createIterator1(){
        return new NullIterator();
    }
}

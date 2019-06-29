package composite;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    Iterator iterator = null;
    ArrayList menuComponents = new AttributeList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        this.menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponent.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public void print() {
        System.out.println("Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}');
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
    @Override
    public Iterator createIterator1(){
        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}

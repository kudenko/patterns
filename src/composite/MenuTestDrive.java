package composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner menu", "Dinner");
        MenuComponent cafeMenu = new Menu("CAFE Menu", "CAFE of course");
        MenuComponent desertMenu = new Menu("Desert Menu", "Desert of course");

        MenuComponent allMenus = new Menu("AllMenus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem("Pasta", "pasta description", false, 3.89));
        dinnerMenu.add(desertMenu);

        desertMenu.add(new MenuItem("Cake","Greate Cake with the chockolate",  true, 3.55 ));

        Waitress waitress = new Waitress(allMenus);
       // waitress.printMenu();
        waitress.printVegeterianMenu();
    }
}

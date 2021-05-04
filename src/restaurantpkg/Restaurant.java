package restaurantpkg;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem("Roasted Cauliflower", 12.00, "Main Course", true);
        MenuItem newItem2 = new MenuItem("Risotto", 18.00, "Main Course", true);
        MenuItem newItem3 = new MenuItem("Chocolate Torte", 9.00, "Dessert", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(startingMenu, today);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        ourMenu.printMenu();

        ourMenu.printItem(newItem3);

        ourMenu.remove(newItem3);

        ourMenu.printMenu();
        System.out.println(ourMenu.menuUpdated());






    }
}

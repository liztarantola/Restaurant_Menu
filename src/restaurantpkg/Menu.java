package restaurantpkg;

import java.util.ArrayList;

import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date lastUpdated;


    public Menu(ArrayList<MenuItem> items, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItem> remove(MenuItem item) {
        int toBeRemoved = -1;
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).equals(item)) {
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

    public String menuUpdated() {
        return ("The menu was updated on " + this.lastUpdated);
    }

    public void printMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getDescription());
            System.out.println((items.get(i).getPrice()));
        }
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }
}





package restaurant;

import java.util.Date;

public class Menu {

    private MenuItem items;

    private Date lastUpdated;


    public Menu(MenuItem items, String specials, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public MenuItem getItems() {
        return items;
    }

    public void setItems(MenuItem items) {
        this.items = items;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}


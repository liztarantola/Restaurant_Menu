package restaurantpkg;

public class MenuItem {
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String description, double price, String category, boolean isNew) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}



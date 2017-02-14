package zajecia.dziesiate;

/**
 * Created by RENT on 2017-02-13.
 */
public class Product {

    private String name;
    private String description;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "[" + name + ", " + description + ", " + price + "]";
    }


}

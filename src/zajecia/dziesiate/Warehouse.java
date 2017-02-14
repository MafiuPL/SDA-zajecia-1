package zajecia.dziesiate;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Warehouse {

    private HashMap<Product, Integer> warehouse;

    public boolean hasAmount(Product product, Integer amount) {
        boolean returnValue = false;
        if (warehouse.containsKey(product)) {
            Integer amountInWarehouse = warehouse.get(product);
            returnValue = amountInWarehouse >= amount;
        }
        return returnValue;
    }

    public HashMap<Product, Integer> get(Product product, int amount) {
        if (!hasAmount(product, amount)) {
            System.out.println("Brak towaru");
            return new HashMap<>();
        }
        Integer amountInWarehouse = warehouse.get(product);
        warehouse.put(product, amountInWarehouse - amount);
        HashMap<Product, Integer> products = new HashMap<>();
        products.put(product, amount);
        return products;
    }

    public Warehouse(HashMap<Product, Integer> warehouse) {
        this.warehouse = warehouse;
    }

    public void add(Product product, int amount) {
        if (warehouse.containsKey(product)) {
            Integer amountInWarehouse = warehouse.get(product);
            warehouse.put(product, amountInWarehouse + amount);
        } else {
            warehouse.put(product, amount);
        }
    }
}

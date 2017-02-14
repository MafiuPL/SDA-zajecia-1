package zajecia.dziesiate;

import zajecia.dziewiate.Address;
import zajecia.dziewiate.User;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Zajecia10 {
    public static void main(String[] args) {
        Product product = new Product("Cebula", "Swieza cebula", 2.99);
        Product product1 = new Product("Pomidory", "super swieze", 3.99);
        Product product2 = new Product("Pyry", "mega dobre", 1.99);

        System.out.println(product.toString());
        System.out.println(product1.toString());
        System.out.println(product2.toString());

        Client client = new Client("Stefan", "Meczywor", "66-66-66", new Address("Poznan", "Poznanska", 99, "60-401", "Polska"));
        System.out.println(client.toString());

        HashMap<Product, Integer> products = new HashMap<>();
        products.put(product, 30);
        products.put(product1, 20);
        products.put(product2, 10);
        Warehouse warehouse = new Warehouse(products);
        HashMap<Product, Integer> productIntegerHashMap = warehouse.get (product1, 19);



//        Order order = new Order(client, products);
//        System.out.println("Total price for this order is " + order.getPrice());


//        HashMap<String, User> map = new HashMap<>();
//        map.put("123456789", new User("Mat", "Jan", "jfjsdfkjsojfjk"));
//        map.put("987654321", new User("Jan", "Frackowiak", "fdjjdjejejfjdjuirur", new Address()));
//        map.forEach((k, v) ->  {
//            System.out.println(k);
//            System.out.println(v);
//            System.out.println();
//        });
    }

}

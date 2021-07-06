package cart;

import com.sun.org.apache.xpath.internal.operations.Bool;
import inventory.Inventory;
import inventory.Product;

import java.util.*;

public class ShoppingCart {
    public HashMap<Integer, List<Product>> getCart() {
        return cart;
    }

    private static HashMap<Integer, List<Product>> cart = new HashMap<>();

    {
        cart.put(1, Collections.emptyList());
        cart.put(2, Collections.emptyList());
        cart.put(3, Collections.emptyList());
        cart.put(4, Collections.emptyList());

    }

    public void addIntoCart(Product product) {
        if (product != null) {
            List<Product> list = cart.get(product.getBarcode());
            List<Product> newlist = new ArrayList<>(list);
            newlist.add(product);
            cart.replace(product.getBarcode(),
                    newlist);
            Inventory inv = new Inventory();
            inv.removeProductFromInventory(product);
        } else throw new RuntimeException("Null Product Given");
    }

    public Product removeFromCart(Product product) {
        Boolean flag = false;
        if (product != null) {
            List<Product> list = cart.get(product.getBarcode());
            List<Product> newlist = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                newlist.add(list.get(i));
            }

            cart.replace(product.getBarcode(),
                    newlist);
            if (!list.equals(newlist)) {
                return list.get(list.size() - 1);
            } else {
                throw new RuntimeException("No Products in Cart");
            }
        } else throw new RuntimeException("Null Given");
    }

    public void showCart() {
        for (Integer k : cart.keySet()
        ) {
            System.out.println(k + "=" + cart.get(k).size());
        }
    }
}

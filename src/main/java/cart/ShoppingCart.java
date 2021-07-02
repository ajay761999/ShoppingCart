package cart;

import inventory.Inventory;
import inventory.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ShoppingCart {
    private static HashMap<Integer, List<Product>> cart = new HashMap<>();

    {
        cart.put(1, Arrays.asList());
        cart.put(2, Arrays.asList());
        cart.put(3, Arrays.asList());
        cart.put(4, Arrays.asList());

    }

    public void addIntoCart(Product product) {
        List<Product> list = cart.get(product.getBarcode());
        List<Product> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newlist.add(list.get(i));
        }
        newlist.add(product);
        cart.replace(product.getBarcode(),
                newlist);
        Inventory inv =new Inventory();
        inv.removeProductFromInventory(product);
    }

    public boolean removeFromCart(Product product) {

        List<Product> list = cart.get(product.getBarcode());
        List<Product> newlist = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            newlist.add(list.get(i));
        }

        cart.replace(product.getBarcode(),
                newlist);
        if (!list.equals(newlist)) {
            return true;
        } else {
            return false;
        }
    }

    public void showCart() {
        for (Integer k : cart.keySet()
        ) {
            System.out.println(k + "=" + cart.get(k).size());
        }
    }
}

package cart;

import java.util.HashMap;

public class ShoppingCart {
    private HashMap<Integer, Integer> cart = new HashMap<>();

    public void addIntoCart(Integer barcode) {

        if (!cart.containsKey(barcode)) {
            cart.put(barcode, 1);
        } else {
            Integer itemQuantity;
            itemQuantity = cart.get(barcode);
            cart.replace(barcode, itemQuantity, itemQuantity + 1);
        }
    }

    public boolean removeFromCart(Integer barcode) {
        if (!cart.containsKey(barcode)) {
            return false;
        } else {
            if (cart.get(barcode) == 1) {
                cart.remove(barcode);
                return true;
            } else if (cart.get(barcode) > 1) {
                Integer quantity = cart.get(barcode);
                cart.replace(barcode, quantity, quantity - 1);
                return true;
            }
        }
        return false;
    }

    public HashMap<Integer, Integer> showCart() {
        return cart;
    }
}

package service;

import cart.ShoppingCart;
import inventory.Inventory;
import inventory.Product;

import java.util.HashMap;

public class CartService {
    private ShoppingCart sc = new ShoppingCart();
    public void addProduct(Integer barcode) {
        Product cart_add = Inventory.products.stream()
                .filter(product -> product.getBarcode().equals(barcode))
                .findFirst()
                .orElseThrow(
                        () -> new RuntimeException("Product not found")
                );

        sc.addIntoCart(cart_add.getBarcode());
        //return cart_add;
    }
    public HashMap<Integer,Integer> showCart(){
        return sc.showCart();
    }
    public void removeProduct(Integer barcode){
        Product cart_add = Inventory.products.stream()
                .filter(product -> product.getBarcode().equals(barcode))
                .findFirst()
                .orElseThrow(
                        () -> new RuntimeException("Product not found")
                );
        sc.removeFromCart(barcode);
    }

}

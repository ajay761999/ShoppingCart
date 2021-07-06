package service;

import cart.ShoppingCart;
import inventory.Inventory;
import inventory.Product;

public class CartService {
    public ShoppingCart getSc() {
        return sc;
    }

    private ShoppingCart sc = new ShoppingCart();

    public Inventory getInv() {
        return inv;
    }

    private Inventory inv = new Inventory();

    public void addProduct(Product product) {
        try {
            sc.addIntoCart(inv.removeProductFromInventory(product));
        } catch (Exception e) {
            if (e.getMessage().equals("No Products in Cart")) {
                System.out.println("Cart is Empty");
            }
        }

        //return cart_add;
    }

    public void showCart() {
        sc.showCart();

    }

    public void showInventory() {
        inv.showInventory();
    }

    public void removeProduct(Product product) {
        try {
            inv.addProductInInventory(sc.removeFromCart(product));
        } catch (Exception e) {
            if (e.getMessage().equals("No Products in Inventory")) {
                System.out.println("Inventory is Empty");
            }
            if(e.getMessage().equalsIgnoreCase("Null Given")){

            }
        }
    }

}

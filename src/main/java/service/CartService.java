package service;

import cart.ShoppingCart;
import inventory.Inventory;
import inventory.Product;

import java.util.HashMap;

public class CartService {
    private ShoppingCart sc = new ShoppingCart();
    private Inventory inv = new Inventory();
    public void addProduct(Product product) {


        sc.addIntoCart(inv.removeProductFromInventory(product));

        //return cart_add;
    }
    public void showCart(){
         sc.showCart();

    }
    public void removeProduct(Product product){

        inv.addProductInInventory(sc.removeFromCart(product));
    }

}

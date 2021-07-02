package service;

import cart.ShoppingCart;
import inventory.Inventory;
import inventory.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

class CartServiceTest {
    @Test
    public void add_product_should_return_matched_product(){
        CartService cs = new CartService();

        Product pr =  new Product(4,"Grapes", BigDecimal.valueOf(100));
        cs.addProduct(pr);
        cs.showCart();
        System.out.println("-----");
        cs.showInventory();
        cs.removeProduct(pr);
        cs.showCart();
        System.out.println("-----");
        cs.showInventory();
    }

}
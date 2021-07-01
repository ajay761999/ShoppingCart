package cart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    public  void add_Into_Cart_Check_Barcode(){
        ShoppingCart sc = new ShoppingCart();
        sc.addIntoCart(1);
        HashMap<Integer,Integer> check_cart = sc.showCart();
        Assertions.assertEquals(1,check_cart.get(1));
        sc.addIntoCart(1);
        check_cart = sc.showCart();
        Assertions.assertEquals(2,check_cart.get(1));

    }
    @Test
    public  void remove_from_Cart_check_removed_product(){
        ShoppingCart sc = new ShoppingCart();
        sc.addIntoCart(1);
        HashMap<Integer,Integer> check_cart = sc.showCart();
        sc.removeFromCart(1);
        Assertions.assertEquals(null,check_cart.get(1));
        sc.addIntoCart(1);
        sc.addIntoCart(1);
        sc.removeFromCart(1);
        Assertions.assertEquals(1,check_cart.get(1));
    }
}
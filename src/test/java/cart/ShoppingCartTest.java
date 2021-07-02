package cart;

import inventory.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ShoppingCartTest {
    @Test
    public void add_Into_Cart_Check_Barcode() {
        ShoppingCart sc = new ShoppingCart();
        Product pr = new Product(4, "Grapes", BigDecimal.valueOf(100));
        sc.addIntoCart(pr);
        sc.showCart();

    }

    @Test
    public void remove_from_Cart_check_removed_product() {
        ShoppingCart sc = new ShoppingCart();
        Product pr = new Product(4, "Grapes", BigDecimal.valueOf(100));
        sc.addIntoCart(pr);
        //sc.removeFromCart(pr);

        sc.addIntoCart(pr);
        sc.addIntoCart(pr);
        sc.removeFromCart(pr);
        sc.showCart();
    }
}
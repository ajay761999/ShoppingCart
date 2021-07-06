package cart;

import inventory.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ShoppingCartTest {
    @Test
    public void add_Into_Cart_Check_Barcode() {
        ShoppingCart sc = new ShoppingCart();
        Product pr = new Product(4, "Grapes", BigDecimal.valueOf(100));
        Product pr1 = new Product(3, "Oranges", BigDecimal.valueOf(100));
        Product pr2 = new Product(2, "Mangos", BigDecimal.valueOf(100));
        Product pr3 = new Product(1, "Apples", BigDecimal.valueOf(100));
        Assertions.assertFalse(sc.getCart().isEmpty());
        Assertions.assertTrue(sc.getCart().get(4).size() == 0);
        sc.addIntoCart(pr);
        Assertions.assertTrue(sc.getCart().get(4).size() == 1);
        sc.addIntoCart(pr1);
        sc.addIntoCart(pr2);
        sc.addIntoCart(pr3);
        for (Integer ks : sc.getCart().keySet()) {
            Assertions.assertTrue(sc.getCart().get(ks).size() == 1);
        }
        sc.showCart();

    }

    @Test
    public void remove_from_Cart_check_removed_product() {
        ShoppingCart sc = new ShoppingCart();
        Product pr = new Product(4, "Grapes", BigDecimal.valueOf(100));
        Product pr1 = new Product(3, "Oranges", BigDecimal.valueOf(100));
        Product pr2 = new Product(2, "Mangos", BigDecimal.valueOf(100));
        Product pr3 = new Product(1, "Apples", BigDecimal.valueOf(100));
        Assertions.assertEquals(4, sc.getCart().values().stream().filter(val -> val.isEmpty()).count());
        //checks that each product list is having no products
        System.out.println(sc.getCart().values());
        sc.addIntoCart(pr);
        sc.addIntoCart(pr1);
        sc.addIntoCart(pr2);
        sc.addIntoCart(pr3);
        Assertions.assertEquals(4, sc.getCart().values().stream().filter(val -> val.size() == 1).count());
        //checks cart contains each product count is 1
        sc.removeFromCart(new Product(1, "Apple", BigDecimal.valueOf(220)));
        Assertions.assertEquals(0, sc.getCart().get(1).size());
        //check if apple count is 0 after removing 1 apple
        sc.showCart();
    }
}
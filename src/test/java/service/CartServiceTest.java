package service;

import inventory.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CartServiceTest {
    @Test
    public void add_product_should_return_matched_product() {
        CartService cs = new CartService();

        Product pr = new Product(4, "Grapes", BigDecimal.valueOf(100));
        Product pr1 = new Product(2, "Mango", BigDecimal.valueOf(150));
        Product pr2 = new Product(3, "Orange", BigDecimal.valueOf(200));

        for (Integer ks : cs.getInv().getProducts().keySet()) {
            Assertions.assertTrue(cs.getInv().getProducts().get(ks).size() == 4);
        }
        cs.addProduct(new Product(4, "Grapes", BigDecimal.valueOf(100)));//added a product
        Assertions.assertTrue(cs.getInv().getProducts().get(4).size() == 3);//checking Inventory
        Assertions.assertTrue(cs.getSc().getCart().get(4).size() == 1);//checking Cart

        cs.addProduct(pr1);//added a product
        Assertions.assertTrue(cs.getInv().getProducts().get(2).size() == 3);//checking Inventory
        Assertions.assertTrue(cs.getSc().getCart().get(2).size() == 1);//checking cart

        cs.removeProduct(pr1);// removed a product
        Assertions.assertTrue(cs.getInv().getProducts().get(2).size() == 4);//checking Inventory
        Assertions.assertTrue(cs.getSc().getCart().get(2).size() == 0);//checking Cart
        cs.removeProduct(pr1);
        cs.removeProduct(null);//checking given Null
        cs.showInventory();//printing Inventory
        System.out.println("----");
        cs.showCart();//printing Cart


    }

}
package service;

import inventory.Inventory;
import inventory.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class CartServiceTest {
    /*@Test
    public void add_product_should_return_matched_product(){
        CartService cs = new CartService();
        cs.addProduct(1);
        Assertions.assertNotNull(cs.showCart());
        cs.addProduct(1);
        cs.addProduct(2);
        cs.addProduct(3);
        cs.addProduct(4);
        cs.addProduct(4);

        for (Integer item:cs.showCart().keySet()
        ) {
            System.out.println(Inventory.products
                    .stream()
                    .filter(product -> product.getBarcode().equals(item))
                    .findFirst()
                    .orElseThrow(
                            () -> new RuntimeException("Product not found")
                    ).getName()+"----"+cs.showCart().get(item)
            );
        }

        cs.removeProduct(4);
        cs.removeProduct(4);
        cs.removeProduct(4);

        //Assertions.assertEquals(Inventory.products.get(0).getBarcode(),cs.showCart().keySet().contains(1));
        for (Integer item:cs.showCart().keySet()
             ) {
            System.out.println(Inventory.products
                    .stream()
                    .filter(product -> product.getBarcode().equals(item))
                    .findFirst()
                    .orElseThrow(
                            () -> new RuntimeException("Product not found")
                    ).getName()+"----"+cs.showCart().get(item)
            );
        }
    }*/

}
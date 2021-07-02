package inventory;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class InventoryTest {
    @Test
    public void remove_product_in_inventory() {
        Inventory inv = new Inventory();
        Product pr = new Product(4, "Grapes", BigDecimal.valueOf(100));
        Product removedProduct = inv.removeProductFromInventory(pr);
        Product removedProduct1 = inv.removeProductFromInventory(pr);
        Product removedProduct2 = inv.removeProductFromInventory(pr);
        Product removedProduct3 = inv.removeProductFromInventory(pr);
        Product removedProduct4 = inv.removeProductFromInventory(pr);
        //inv.addProductInInventory(pr);
        inv.showInventory();
        System.out.println(removedProduct3);
    }

    @Test
    public void add_product_in_inventory() {
        Inventory inv = new Inventory();
        Product pr = new Product(4, "Grapes", BigDecimal.valueOf(100));
        inv.addProductInInventory(pr);
        inv.showInventory();
    }
}
package inventory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    public static HashMap<Integer, List<Product>> products = new HashMap<>();

    {
        products.put(1, Arrays.asList(
                new Product(1, "Apple", BigDecimal.valueOf(220)),
                new Product(1, "Apple", BigDecimal.valueOf(220)),
                new Product(1, "Apple", BigDecimal.valueOf(220)),
                new Product(1, "Apple", BigDecimal.valueOf(220))
        ));
        products.put(2, Arrays.asList(
                new Product(2, "Mango", BigDecimal.valueOf(150)),
                new Product(2, "Mango", BigDecimal.valueOf(150)),
                new Product(2, "Mango", BigDecimal.valueOf(150)),
                new Product(2, "Mango", BigDecimal.valueOf(150))

        ));
        products.put(3, Arrays.asList(
                new Product(3, "Orange", BigDecimal.valueOf(200)),
                new Product(3, "Orange", BigDecimal.valueOf(200)),
                new Product(3, "Orange", BigDecimal.valueOf(200)),
                new Product(3, "Orange", BigDecimal.valueOf(200))

        ));
        products.put(4, Arrays.asList(
                new Product(4, "Grapes", BigDecimal.valueOf(100)),
                new Product(4, "Grapes", BigDecimal.valueOf(100)),
                new Product(4, "Grapes", BigDecimal.valueOf(100)),
                new Product(4, "Grapes", BigDecimal.valueOf(100))

        ));


    }

    public void addProductInInventory(Product product) {
        List<Product> list = products.get(product.getBarcode());
        List<Product> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newlist.add(list.get(i));
        }
        newlist.add(product);
        products.replace(product.getBarcode(),
                newlist);
    }

    public Product removeProductFromInventory(Product product) {

        List<Product> list = products.get(product.getBarcode());
        List<Product> newlist = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            newlist.add(list.get(i));
        }

        products.replace(product.getBarcode(),
                newlist);
        if (!list.equals(newlist)) {
            return list.get(list.size() - 1);
        } else {
            return null;
        }
    }

    public void showInventory() {
        for (Integer k : products.keySet()
        ) {
            System.out.println(k + "=" + products.get(k).size());
        }
    }


}

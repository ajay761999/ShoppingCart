package inventory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Inventory {
    public static List<Product> products = Arrays.asList(
            new Product(1, "Apple", BigDecimal.valueOf(220)),
            new Product(2, "Mango", BigDecimal.valueOf(50)),
            new Product(3, "Orange", BigDecimal.valueOf(200)),
            new Product(4, "Grapes", BigDecimal.valueOf(100))
    );
}

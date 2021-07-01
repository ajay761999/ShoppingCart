package inventory;

import java.math.BigDecimal;

public class Product {
    private final Integer barcode;
    private final String name;
    private final BigDecimal price;

    public Product(Integer barcode, String name, BigDecimal price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    public Integer getBarcode() {
        return barcode;
    }


    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }


}

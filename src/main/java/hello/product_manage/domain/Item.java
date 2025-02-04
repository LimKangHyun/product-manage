package hello.product_manage.domain;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private String name;
    private Long price;
    private Long quantity;

    public Item() {
    }

    public Item(String name, Long price, Long quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

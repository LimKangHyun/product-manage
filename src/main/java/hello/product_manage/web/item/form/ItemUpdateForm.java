package hello.product_manage.web.item.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class ItemUpdateForm {

    @NotNull
    private long id;

    @NotNull
    private String itemName;

    @NotNull
    @Range(min = 1000, max = 5000000)
    private Integer price;

    @NotNull
    private Integer quantity;
}

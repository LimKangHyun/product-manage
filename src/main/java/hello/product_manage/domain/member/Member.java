package hello.product_manage.domain.member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;

    @NotEmpty
    private String name;
}

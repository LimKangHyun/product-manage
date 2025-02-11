package hello.product_manage.domain.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Member implements Serializable {

    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String loginId;

    @Column(nullable = false)
    @NotEmpty
    private String password;

    @Column(nullable = false)
    @NotEmpty
    private String name;
}

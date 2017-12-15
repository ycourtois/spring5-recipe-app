package guru.springframework.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = "recipe")
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @OneToOne
    private UnitOfMeasure uom;

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    @ManyToOne
    private Recipe recipe;

}

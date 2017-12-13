package guru.springframework.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
@Getter
@Setter
@Entity
@EqualsAndHashCode(exclude = "recipe")
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}

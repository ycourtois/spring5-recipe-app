package guru.springframework.repositories;

import guru.springframework.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}

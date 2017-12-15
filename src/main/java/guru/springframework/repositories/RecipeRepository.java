package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

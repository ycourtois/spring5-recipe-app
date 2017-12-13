package guru.springframework.service;

import guru.springframework.domain.Recipe;

import java.util.List;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
public interface RecipeService {

    List<Recipe> getAllRecipes();
}

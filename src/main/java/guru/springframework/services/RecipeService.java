package guru.springframework.services;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

import java.util.List;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
public interface RecipeService {

    List<Recipe> getAllRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}

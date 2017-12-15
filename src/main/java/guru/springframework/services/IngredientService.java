package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/14/2017
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long idToDelete);
}

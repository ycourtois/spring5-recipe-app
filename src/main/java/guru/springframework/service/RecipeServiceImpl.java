package guru.springframework.service;

import guru.springframework.domain.Recipe;
import guru.springframework.repository.RecipeRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.StreamUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    @NonNull
    private RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes() {
        return StreamUtils.createStreamFromIterator(recipeRepository.findAll().iterator()).collect(Collectors.toList());
    }

}

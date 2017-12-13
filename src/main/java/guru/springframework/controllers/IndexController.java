package guru.springframework.controllers;

import guru.springframework.domain.Recipe;
import guru.springframework.service.RecipeService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jt on 6/1/17.
 */
@Controller
@RequiredArgsConstructor
public class IndexController {

//    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;
    @NonNull
    private RecipeService recipeService;

    private final static String RECIPES_ATTR = "recipes";

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

//        Optional<Category> category = categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Teaspoon");

//        System.out.println();

        final List<Recipe> recipes = recipeService.getAllRecipes();

        model.addAttribute(RECIPES_ATTR, recipes);

        return "index";
    }
}

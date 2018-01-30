package rs.springframework.services;

import rs.springframework.commands.RecipeCommand;
import rs.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by rs
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}

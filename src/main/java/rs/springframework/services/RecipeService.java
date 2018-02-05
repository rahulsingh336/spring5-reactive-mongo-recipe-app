package rs.springframework.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import rs.springframework.commands.RecipeCommand;
import rs.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by rs
 */
public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand>  saveRecipeCommand(RecipeCommand command);

    Mono<Void> deleteById(String idToDelete);
}

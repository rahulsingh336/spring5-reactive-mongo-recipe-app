package rs.springframework.repositories;

import rs.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rs
 */
public interface RecipeRepository extends CrudRepository<Recipe, String> {
}

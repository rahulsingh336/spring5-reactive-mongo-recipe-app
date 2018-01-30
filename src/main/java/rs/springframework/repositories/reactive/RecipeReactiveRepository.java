package rs.springframework.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.CrudRepository;
import rs.springframework.domain.Recipe;

/**
 * Created by rs
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}

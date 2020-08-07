package guru.springframework.spring5recepies.repositories;

import guru.springframework.spring5recepies.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
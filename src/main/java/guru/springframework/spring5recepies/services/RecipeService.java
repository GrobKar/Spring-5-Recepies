package guru.springframework.spring5recepies.services;

import guru.springframework.spring5recepies.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

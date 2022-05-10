package tacos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tacos.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

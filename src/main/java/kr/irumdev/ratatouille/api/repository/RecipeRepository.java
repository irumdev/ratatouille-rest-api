package kr.irumdev.ratatouille.api.repository;

import kr.irumdev.ratatouille.api.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    Optional<Recipe> findBySeq(Integer seq);
}

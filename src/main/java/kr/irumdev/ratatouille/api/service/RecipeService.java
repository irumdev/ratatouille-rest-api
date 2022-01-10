package kr.irumdev.ratatouille.api.service;

import kr.irumdev.ratatouille.api.code.ErrorCode;
import kr.irumdev.ratatouille.api.dto.RecipeDto;
import kr.irumdev.ratatouille.api.entity.Recipe;
import kr.irumdev.ratatouille.api.exception.BaseException;
import kr.irumdev.ratatouille.api.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeDto getRecipeDetail(Integer recipeSeq) {
        return RecipeDto.fromEntity(getRecipeBySeq(recipeSeq));
    }

    private Recipe getRecipeBySeq(Integer recipeSeq) {
        return recipeRepository.findBySeq(recipeSeq)
                .orElseThrow(() -> new BaseException(ErrorCode.NO_RECIPE));
    }
}

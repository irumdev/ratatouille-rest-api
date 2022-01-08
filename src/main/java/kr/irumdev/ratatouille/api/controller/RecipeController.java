package kr.irumdev.ratatouille.api.controller;

import kr.irumdev.ratatouille.api.dto.RecipeDto;
import kr.irumdev.ratatouille.api.service.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;

    @GetMapping("/recipes/{recipeSeq}")
    public RecipeDto getRecipeDetail(@PathVariable final Integer recipeSeq) {
        return recipeService.getRecipeDetail(recipeSeq);
    }
}

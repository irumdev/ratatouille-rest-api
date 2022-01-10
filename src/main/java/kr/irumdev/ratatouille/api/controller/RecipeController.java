package kr.irumdev.ratatouille.api.controller;

import kr.irumdev.ratatouille.api.dto.RecipeDto;
import kr.irumdev.ratatouille.api.service.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    @GetMapping("/{recipeSeq}")
    public RecipeDto getRecipeDetail(@PathVariable final Integer recipeSeq) {
        return recipeService.getRecipeDetail(recipeSeq);
    }
}

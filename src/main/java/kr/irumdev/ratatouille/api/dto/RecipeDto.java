package kr.irumdev.ratatouille.api.dto;

import kr.irumdev.ratatouille.api.entity.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class RecipeDto {
    private Integer seq;
    private String title;
    private String intro;
    private String thumbnail;
    private String volume;
    private String spent;
    private String difficulty;
    private Integer views;

    public static RecipeDto fromEntity(Recipe recipe) {
        return RecipeDto.builder()
                .seq(recipe.getSeq())
                .title(recipe.getTitle())
                .intro(recipe.getIntro())
                .thumbnail(recipe.getThumbnail())
                .volume(recipe.getVolume())
                .spent(recipe.getSpent())
                .difficulty(recipe.getDifficulty())
                .views(recipe.getViews())
                .build();
    }
}

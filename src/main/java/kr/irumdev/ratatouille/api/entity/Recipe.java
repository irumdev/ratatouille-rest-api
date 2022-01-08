package kr.irumdev.ratatouille.api.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "recipes")
@EntityListeners(AuditingEntityListener.class)
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private Integer seq;
    private String title;
    private String intro;
    private String thumbnail;
    private String volume;
    private String spent;
    private String difficulty;
    private Integer views;

    @CreatedDate
    private LocalDate postedAt;

    @LastModifiedDate
    private LocalDate modifiedAt;
}

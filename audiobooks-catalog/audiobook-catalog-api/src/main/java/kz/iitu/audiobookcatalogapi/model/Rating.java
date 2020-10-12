package kz.iitu.audiobookcatalogapi.model;

import lombok.Data;

@Data
public class Rating {

    private Long audioBookId;
    private Integer rating;

}

package kz.iitu.audiobookcatalogapi.model;

import lombok.Data;

@Data
public class AudioBookCatalog {
        private Long audioBookId;
        private String title;
        private Double price;
        private Integer rating;
}


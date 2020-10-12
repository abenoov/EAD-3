package kz.iitu.audiobookcatalogapi.model;

import lombok.Data;

@Data
public class AudioBook {
    private Long id;
    private String title;
    private String description;
    private Double price;
}

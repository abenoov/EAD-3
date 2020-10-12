package kz.iitu.audiobookinformationservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AudioBook {

    private Long id;
    private String title;
    private String description;
    private Double price;
}

package kz.iitu.recommendation.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "recommendation")
@Data
@NoArgsConstructor
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rating;

    private String name;

    @ManyToOne
    @JoinColumn(name = "audio_id", nullable = false)
    private Audio audio;




}

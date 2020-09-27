package kz.iitu.mukhtar.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "audio")
@Data
@NoArgsConstructor
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    private String name;


    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime uploadDate = LocalDateTime.now();

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime releaseDate;

    private double price;

    private int rating;
}

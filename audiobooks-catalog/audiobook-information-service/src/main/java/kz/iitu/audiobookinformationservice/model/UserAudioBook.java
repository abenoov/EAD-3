package kz.iitu.audiobookinformationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAudioBook {
    private Long userId;
    private List<AudioBook> audioBooks;
}

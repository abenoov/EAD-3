package kz.iitu.audiobookinformationservice.controller;

import kz.iitu.audiobookinformationservice.model.AudioBook;
import kz.iitu.audiobookinformationservice.model.UserAudioBook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/audiobook/info")
public class AudioBookController {

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserAudioBooks(@PathVariable Long userId) {
        List<AudioBook> userAudioBooks = new ArrayList<>();

        userAudioBooks.add(AudioBook.builder().id(1L).title("Audio Book1")
                .description("Description1").price(200.0).build());
        userAudioBooks.add(AudioBook.builder().id(2L).title("Audio Book2")
                .description("Description2").price(500.0).build());
        userAudioBooks.add(AudioBook.builder().id(3L).title("Audio Book3")
                .description("Description3").price(300.0).build());
        userAudioBooks.add(AudioBook.builder().id(4L).title("Audio Book4")
                .description("Description4").price(400.0).build());

        return ResponseEntity.ok(new UserAudioBook(userId, userAudioBooks));
    }
}


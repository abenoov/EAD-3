package kz.iitu.audiobookcatalogapi.controller;

import kz.iitu.audiobookcatalogapi.model.AudioBook;
import kz.iitu.audiobookcatalogapi.model.AudioBookCatalog;
import kz.iitu.audiobookcatalogapi.model.Rating;
import kz.iitu.audiobookcatalogapi.service.AudioBookInformationService;
import kz.iitu.audiobookcatalogapi.service.AudioBookRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/audiobooks")
public class AudioBookCatalogController {

    @Autowired
    private AudioBookInformationService audioBookInformationService;

    @Autowired
    private AudioBookRatingService audioBookRatingService;

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserAudioBookCatalog(@PathVariable("userId") Long userId) {
        List<AudioBook> userAudioBooks = audioBookInformationService.getUserAudioBooks(userId);

        List<AudioBookCatalog> userAudioBookCatalog = new ArrayList<>();

        for (AudioBook audioBook : userAudioBooks) {
            AudioBookCatalog audioBookCatalog = new AudioBookCatalog();
            audioBookCatalog.setAudioBookId(audioBook.getId());
            audioBookCatalog.setTitle(audioBook.getTitle());
            audioBookCatalog.setPrice(audioBook.getPrice());

          //  Rating rating = audioBookRatingService.getAudioBookRating(audioBook.getId());
            //audioBookCatalog.setRating(rating.getRating()); // заполняем
            userAudioBookCatalog.add(audioBookCatalog); // далее добавляем к юзеру
        }

        return ResponseEntity.ok(userAudioBookCatalog);
    }
}

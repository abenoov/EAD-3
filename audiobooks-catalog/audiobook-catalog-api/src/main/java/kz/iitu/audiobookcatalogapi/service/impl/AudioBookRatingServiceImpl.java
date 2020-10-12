package kz.iitu.audiobookcatalogapi.service.impl;

import kz.iitu.audiobookcatalogapi.model.Rating;
import kz.iitu.audiobookcatalogapi.service.AudioBookRatingService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AudioBookRatingServiceImpl implements AudioBookRatingService {
    @Override
    public Rating getAudioBookRating(Long audioBookId) {
        //TODO get ratings for each audio book from audio-book-ratins microservice
        return null;
    }
}

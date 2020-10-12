package kz.iitu.audiobookcatalogapi.service;

import kz.iitu.audiobookcatalogapi.model.AudioBook;
import kz.iitu.audiobookcatalogapi.model.Rating;

import java.util.List;

public interface AudioBookRatingService {

    Rating getAudioBookRating(Long audioBookId);

}

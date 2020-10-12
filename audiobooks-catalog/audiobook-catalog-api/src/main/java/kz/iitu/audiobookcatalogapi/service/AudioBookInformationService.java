package kz.iitu.audiobookcatalogapi.service;

import kz.iitu.audiobookcatalogapi.model.AudioBook;
import java.util.List;
public interface AudioBookInformationService {

    List<AudioBook> getUserAudioBooks(Long userId);

}

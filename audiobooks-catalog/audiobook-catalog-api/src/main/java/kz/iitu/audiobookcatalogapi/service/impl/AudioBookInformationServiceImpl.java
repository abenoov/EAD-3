package kz.iitu.audiobookcatalogapi.service.impl;

import kz.iitu.audiobookcatalogapi.model.AudioBook;
import kz.iitu.audiobookcatalogapi.model.UserAudioBook;
import kz.iitu.audiobookcatalogapi.service.AudioBookInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AudioBookInformationServiceImpl implements AudioBookInformationService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<AudioBook> getUserAudioBooks(Long userId) {
        // call audio book information data from audio-book-info-microservice

        //RestTemplate restTemplate = new RestTemplate();
        UserAudioBook userAudioBooks = restTemplate.getForObject("http://audiobook-information-service/audiobook/info/"+userId, UserAudioBook.class);

        return userAudioBooks.getAudioBooks();
    }
}

package kz.iitu.recommendation.service;

import kz.iitu.recommendation.model.entity.Audio;
import kz.iitu.recommendation.model.entity.Recommendation;
import kz.iitu.recommendation.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;
    private final RestTemplate restTemplate;

    public Recommendation createRecommendation(Recommendation recommendation){
        Audio audio = restTemplate.getForObject("http://localhost:8085/audio/" + recommendation.getAudio().getId(), Audio.class);




        recommendation.setRating(audio.getRating());
        recommendation.setName(audio.getName());

        return recommendationRepository.save(recommendation);
    }

}

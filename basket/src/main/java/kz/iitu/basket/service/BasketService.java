package kz.iitu.basket.service;

import kz.iitu.basket.entity.Audio;
import kz.iitu.basket.entity.Basket;
import kz.iitu.basket.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;
    private final RestTemplate restTemplate;

    public Basket createItem(Basket basket){
        Audio audio = restTemplate.getForObject("http://localhost:8085/audio/" + basket.getAudio().getId(), Audio.class);




        basket.setId(audio.getId());
        basket.setName(audio.getName());

        return basketRepository.save(basket);
    }

}
